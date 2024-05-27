//package com.lms.librarymanagmentsystemapi.bootStrap;
//
//import com.lms.librarymanagmentsystemapi.entity.Book;
//import com.lms.librarymanagmentsystemapi.entity.Librarian;
//import com.lms.librarymanagmentsystemapi.entity.Patron;
//import com.lms.librarymanagmentsystemapi.repository.BookRepo;
//import com.lms.librarymanagmentsystemapi.repository.LibrarianRepo;
//import com.lms.librarymanagmentsystemapi.repository.PatronRepo;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//import java.util.Set;
//
//@Component
//public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
//    private BookRepo bookRepo;
//    private LibrarianRepo librarianRepo;
//    private PatronRepo patronRepo;
//
//    public DevBootStrap(BookRepo bookRepo, LibrarianRepo librarianRepo, PatronRepo patronRepo) {
//        this.bookRepo = bookRepo;
//        this.librarianRepo = librarianRepo;
//        this.patronRepo = patronRepo;
//    }
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        initData();
//    }
//
//    private void initData(){
//
//        Book book1 = new Book( 198667 ,2014, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
//        Librarian librarian1 = new Librarian("khaled","admin","01097010260","khaled","1234");
//        Patron patron1 = new Patron("ali","user","01124622467","ali","1234");
//        book1.setPatron(patron1);
//        bookRepo.save(book1);
//        librarianRepo.save(librarian1);
//        patronRepo.save(patron1);
//
//
//        // Book 2
//        Book book2 = new Book(204578, 2017, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Fantasy");
//        Librarian librarian2 = new Librarian("sara", "admin", "01234567890", "sara", "5678");
//        Patron patron2 = new Patron("mohamed", "user", "01234567891", "mohamed", "abcd");
//        book2.setPatron(patron2);
//        bookRepo.save(book2);
//        librarianRepo.save(librarian2);
//        patronRepo.save(patron2);
//
//        // Book 3
//        Book book3 = new Book(302156, 2019, "The Great Gatsby", "F. Scott Fitzgerald", "Classics");
//        Librarian librarian3 = new Librarian("reem", "admin", "01123456789", "reem", "pass123");
//        Patron patron3 = new Patron("ahmed", "user", "01123456780", "ahmed", "password");
//        book3.setPatron(patron3);
//        bookRepo.save(book3);
//        librarianRepo.save(librarian3);
//        patronRepo.save(patron3);
//
//        // Book 4
//        Book book4 = new Book(415678, 2020, "To Kill a Mockingbird", "Harper Lee", "Classics");
//        Librarian librarian4 = new Librarian("amira", "admin", "01098765432", "amira", "4321");
//        Patron patron4 = new Patron("sami", "user", "01098765431", "sami", "passw0rd");
//        book4.setPatron(patron4);
//        bookRepo.save(book4);
//        librarianRepo.save(librarian4);
//        patronRepo.save(patron4);
//
//        // Book 5
//        Book book5 = new Book(518790, 2018, "1984", "George Orwell", "Dystopian");
//        Librarian librarian5 = new Librarian("mona", "admin", "01987654321", "mona", "12345");
//        Patron patron5 = new Patron("noura", "user", "01987654320", "noura", "secure");
//        book5.setPatron(patron5);
//        bookRepo.save(book5);
//        librarianRepo.save(librarian5);
//        patronRepo.save(patron5);
//    }
//
//    @Override
//    public boolean supportsAsyncExecution() {
//        return ApplicationListener.super.supportsAsyncExecution();
//    }
//}
