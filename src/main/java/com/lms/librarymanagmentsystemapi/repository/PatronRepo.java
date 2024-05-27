package com.lms.librarymanagmentsystemapi.repository;

import com.lms.librarymanagmentsystemapi.entity.Book;
import com.lms.librarymanagmentsystemapi.entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface PatronRepo extends JpaRepository<Patron,Long> {
    public Patron findPatronByID(Long id);

}
