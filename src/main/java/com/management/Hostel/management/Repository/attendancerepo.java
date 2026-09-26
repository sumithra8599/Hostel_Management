package com.management.Hostel.management.Repository;

import com.management.Hostel.management.Entity.Attendance;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface attendancerepo extends JpaRepository<Attendance,Integer> {

    @Modifying
    @Transactional
    @Query("delete from Attendance where date=:date")
    void deletebydate(@Param("date") LocalDate date);
}
