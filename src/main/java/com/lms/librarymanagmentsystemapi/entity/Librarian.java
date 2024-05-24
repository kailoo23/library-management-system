package com.lms.librarymanagmentsystemapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="LIBRARIAN")
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int liID;
    private String name;
    private String role;
    private String username;
    private String password;

    @OneToMany(mappedBy="librarian")
    private Set<Patron> patrons;

    @OneToMany(mappedBy="librarian")
    private Set<Book> books;


}
