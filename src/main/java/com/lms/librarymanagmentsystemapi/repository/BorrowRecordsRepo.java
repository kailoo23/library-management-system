package com.lms.librarymanagmentsystemapi.repository;

import com.lms.librarymanagmentsystemapi.entity.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRecordsRepo extends JpaRepository<BorrowRecord,Long> {
    public BorrowRecord findBorrowRecordByTitle(String title);

}
