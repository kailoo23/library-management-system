package com.lms.librarymanagmentsystemapi.services;

import com.lms.librarymanagmentsystemapi.Exeption.BooksException;
import com.lms.librarymanagmentsystemapi.entity.Book;
import com.lms.librarymanagmentsystemapi.entity.Patron;
import com.lms.librarymanagmentsystemapi.repository.BookRepo;
import com.lms.librarymanagmentsystemapi.repository.LibrarianRepo;
import com.lms.librarymanagmentsystemapi.repository.PatronRepo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@AllArgsConstructor
public class AdminService {

    private final LibrarianRepo librarianRepo;
    private final PatronRepo patronRepo;
    private final BookRepo bookRepo;

    public void editBookByID(Long id, Book book) {
        Book existingBook = bookRepo.findBookByID(id);
        try {
            if (bookRepo.findBookByID(id) == null) {
                throw new BooksException("Book does not exist");
            } else {
                existingBook.setTitle(book.getTitle());
                existingBook.setIsbn(book.getIsbn());
                existingBook.setGenre(book.getGenre());
                existingBook.setAuthor(book.getAuthor());
                existingBook.setYear(book.getYear());
                bookRepo.save(existingBook);
            }
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
    }

    public void deleteBookByID(Long id) {
        try {
            if (bookRepo.findBookByID(id) == null) {
                throw new BooksException("Book does not exist");
            } else {
                bookRepo.deleteById(id);
            }
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
    }


    public List<Patron> gitPatrons() {

        return patronRepo.findAll();
    }

    public void addBook(Book book) {
        try {
            if (bookRepo.findBookByTitle(book.getTitle()) == null) {
                bookRepo.save(book);
            } else {
                System.out.println(">>>>>>>>>>>>>>>>>" + bookRepo.findBookByTitle(book.getTitle()));
                throw new BooksException("Book already exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
