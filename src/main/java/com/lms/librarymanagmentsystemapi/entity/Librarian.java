package com.lms.librarymanagmentsystemapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "librarian")
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int liID;

    private String name;
    private String role;
    private String phone;
    private String username;
    private String password;

//    @OneToMany(mappedBy="librarian")
//    private Set<Patron> patrons;
//    @OneToMany(mappedBy="librarian")
//    private Set<Book> books;
//

    public Librarian(String name, String role,String phone, String username, String password) {
        this.name = name;
        this.role = role;
        this.phone= phone;
        this.username = username;
        this.password = password;
    }
    public Librarian() {

    }
}
