package com.lms.librarymanagmentsystemapi.repository;

import com.lms.librarymanagmentsystemapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Long> {

    public Book findBookByID(Long id);
    public Book findBookByTitle(String title);
}
