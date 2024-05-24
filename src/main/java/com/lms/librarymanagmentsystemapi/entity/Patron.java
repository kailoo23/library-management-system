package com.lms.librarymanagmentsystemapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="PATRON")
public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paID;
    private String name;
    private String role;
    private String address;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name="liID", nullable=false)
    private Librarian librarian;

    @OneToMany(mappedBy="patron")
    private Set<Book> books;


}
