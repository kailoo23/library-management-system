package com.lms.librarymanagmentsystemapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long boID;
    private int isbn;
    private int year;
    private String title;
    private String author;
    private String genre;

    @ManyToOne
    @JoinColumn(name="liID", nullable=false)
    private Librarian librarian;

    @ManyToOne
    @JoinColumn(name="paID", nullable=false)
    private Patron patron;

}
