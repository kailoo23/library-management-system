package com.lms.librarymanagmentsystemapi.repository;

import com.lms.librarymanagmentsystemapi.entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface LibrarianRepo extends JpaRepository<Librarian,Long> {
}
