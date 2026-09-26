package com.management.Hostel.management.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class attendacedto {
String username;
String password;
Integer id;
String roomno;

    public attendacedto() {
    }

    public attendacedto(Integer id,String username,String password,String roomno) {
        this.id = id;
        this.username=username;
        this.password=password;
        this.roomno=roomno;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
