package com.lms.librarymanagmentsystemapi.controlers;

import com.lms.librarymanagmentsystemapi.entity.Book;
import com.lms.librarymanagmentsystemapi.entity.Patron;
import com.lms.librarymanagmentsystemapi.services.AdminService;
import com.lms.librarymanagmentsystemapi.services.PatronService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@AllArgsConstructor
public class LibrarianController {


    private final AdminService adminService;
    private final PatronService service;


    @PostMapping("/book")
    public Book addBook(@RequestBody Book book)
    {
        adminService.addBook(book);
        return book;
    }
    @GetMapping("/patrons")
    public List<Patron> findAllPatrons()
    {
        return adminService.gitPatrons();
    }

    @PutMapping("/book/{id}")
    public Book editBook( @PathVariable("id") Long id,@RequestBody Book book)
    {
        adminService.editBookByID(id,book);
        return book;
    }
    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        adminService.deleteBookByID(id);
        return "deleted";
    }



}
