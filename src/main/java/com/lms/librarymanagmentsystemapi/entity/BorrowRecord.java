package com.lms.librarymanagmentsystemapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name= "records")
@NoArgsConstructor
public class BorrowRecord {

    @Id
    @Column(name="reid")
    private Long ID;

    private String Title;
    private String borrower;
    private String borrowDate;
    private String returnDate;
}
