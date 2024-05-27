package com.lms.librarymanagmentsystemapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "patron")
public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "paID")
    private int ID;

    private String name;
    private String role;
    private String phone;
    private String username;
    private String password;

    public Patron(String name, String role,String phone, String username, String password) {
        this.name = name;
        this.role = role;
        this.phone=phone;
        this.username = username;
        this.password = password;
    }

    public Patron() {

    }
}
