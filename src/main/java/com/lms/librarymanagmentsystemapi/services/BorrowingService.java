package com.lms.librarymanagmentsystemapi.services;

import com.lms.librarymanagmentsystemapi.Exeption.BooksException;
import com.lms.librarymanagmentsystemapi.entity.Book;
import com.lms.librarymanagmentsystemapi.entity.BorrowRecord;
import com.lms.librarymanagmentsystemapi.entity.Patron;
import com.lms.librarymanagmentsystemapi.repository.BookRepo;
import com.lms.librarymanagmentsystemapi.repository.BorrowRecordsRepo;
import com.lms.librarymanagmentsystemapi.repository.PatronRepo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Log4j2
@AllArgsConstructor
public class BorrowingService {

    private final BorrowRecordsRepo recordRepo;
    private final PatronService patronService;
    private final PatronRepo patronRepo;
    private final BookRepo bookRepo;


    public void addRecord(Long patronID,Long bookID) {
        Book boBook = patronService.getBookByID(bookID);
        Patron borrower =patronRepo.findPatronByID(patronID);
        BorrowRecord record = new BorrowRecord();
        record.setTitle(boBook.getTitle());
        record.setBorrower(borrower.getName());
        record.setBorrowDate(LocalDate.now().toString());
        try {
            if (recordRepo.findBorrowRecordByTitle(boBook.getTitle())==null) {
                recordRepo.save(record);
            } else {
                throw new BooksException("Book already borrowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void returnBook(Long bookID) {
        Book boBook = patronService.getBookByID(bookID);
        try {
            if (recordRepo.findBorrowRecordByTitle(boBook.getTitle())!=null) {
                BorrowRecord existingRecord = recordRepo.findBorrowRecordByTitle(boBook.getTitle());
                existingRecord.setReturnDate(LocalDate.now().toString());
                recordRepo.save(existingRecord);
            } else {
                throw new BooksException("that's not a borrowed book");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
