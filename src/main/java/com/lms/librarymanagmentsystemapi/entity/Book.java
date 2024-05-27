package com.lms.librarymanagmentsystemapi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "book")
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "boID")
    private Long ID;
    private int isbn;
    private int year;
    private String title;
    private String author;
    private String genre;


    @ManyToOne
    @JoinColumn(name="paID", nullable=false)
    private Patron patron;

    public Book(int isbn, int year, String title, String author, String genre) {
        this.isbn = isbn;
        this.year = year;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

}
