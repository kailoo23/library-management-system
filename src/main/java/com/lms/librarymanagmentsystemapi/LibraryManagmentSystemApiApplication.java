package com.lms.librarymanagmentsystemapi;

import com.lms.librarymanagmentsystemapi.entity.Book;
import com.lms.librarymanagmentsystemapi.entity.Librarian;
import com.lms.librarymanagmentsystemapi.entity.Patron;
import com.lms.librarymanagmentsystemapi.repository.BookRepo;
import com.lms.librarymanagmentsystemapi.repository.LibrarianRepo;
import com.lms.librarymanagmentsystemapi.repository.PatronRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagmentSystemApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagmentSystemApiApplication.class, args);
    }
}
