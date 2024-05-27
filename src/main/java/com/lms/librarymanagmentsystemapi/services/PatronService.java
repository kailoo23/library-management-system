package com.lms.librarymanagmentsystemapi.services;

import com.lms.librarymanagmentsystemapi.Exeption.BooksException;
import com.lms.librarymanagmentsystemapi.Exeption.PatronException;
import com.lms.librarymanagmentsystemapi.entity.Book;
import com.lms.librarymanagmentsystemapi.entity.Patron;
import com.lms.librarymanagmentsystemapi.repository.BookRepo;
import com.lms.librarymanagmentsystemapi.repository.PatronRepo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Log4j2
public class PatronService {

    private final PatronRepo patronRepo;
    private final BookRepo bookRepo;


    public void editPatreonByID(Long id, Patron patron) {
        Patron existingPatreon = patronRepo.findPatronByID(id);
        try {
            if (bookRepo.findBookByID(id) == null) {
                throw new BooksException("Book does not exist");
            } else {
                existingPatreon.setName(patron.getName());
                existingPatreon.setPhone(patron.getPhone());
                existingPatreon.setRole(patron.getRole());
                existingPatreon.setUsername(patron.getUsername());
                existingPatreon.setPassword(patron.getPassword());
                patronRepo.save(existingPatreon);
            }
        } catch (Exception e) {
            //log.error(e.getStackTrace());
        }
    }
    public List<Book> getBooks(){
       return bookRepo.findAll();
    }

    public void deletePatronByID(Long id) {
        try {
            if (patronRepo.findPatronByID(id) == null) {
                throw new PatronException("Patron does not exist");
            } else {
                patronRepo.deleteById(id);
            }
        } catch (Exception e) {
            //log.error(e.getStackTrace());
        }
    }

    public Book getBookByID(Long id){
        return bookRepo.findBookByID(id);
    }


}
