package com.management.Hostel.management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity

public class Attendance {
    @Id
    private Integer id;
    private String username;
    private LocalDate date;
    private LocalTime time;
    private String status;
    private String roomno;

    public Attendance() {
    }

    public Attendance(  Integer id ,String username, LocalDate date, LocalTime time,String status,String roomno) {

        this.id=id;
        this.username = username;
        this.date = date;
        this.time = time;
        this.status=status;
        this.roomno=roomno;
    }

    public String isStatus() {
        return status;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
