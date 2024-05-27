package com.lms.librarymanagmentsystemapi.controlers;

import com.lms.librarymanagmentsystemapi.entity.Book;
import com.lms.librarymanagmentsystemapi.entity.Patron;
import com.lms.librarymanagmentsystemapi.services.PatronService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PatronController {

    private final PatronService service;

    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return service.getBooks();
    }

    @GetMapping("/book/{id}")
    public Book findBooksByID(@PathVariable("id") Long id) {
        return service.getBookByID(id);
    }

    @DeleteMapping("/patron/{id}")
    public void deletePatronByID( @PathVariable("id") Long id){
        service.deletePatronByID(id);
    }

    @GetMapping("/patron/{id}")
    public Book findPatronByID(@PathVariable("id") Long id) {
        return service.getBookByID(id);
    }

    @PutMapping("/patron/{id}")
    public Patron editPatronByID(@PathVariable("id") Long id, @RequestBody Patron patron) {
        service.editPatreonByID(id,patron);
        return patron;
    }
    @PutMapping("/patron/borrow/{paid}/{bid}")
    public Patron borrowBookByID(@PathVariable("paid") Long paid,@PathVariable("bid") Long bid, @RequestBody Patron patron) {
     //   service.editPatreonByID(paid,patron);
        return patron;
    }


}
