package com.management.Hostel.management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String roomno;
    private char floor;
    private int memberscount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public char getFloor() {
        return floor;
    }

    public void setFloor(char floor) {
        this.floor = floor;
    }

    public int getMemberscount() {
        return memberscount;
    }

    public void setMemberscount(int memberscount) {
        this.memberscount = memberscount;
    }

    public Room() {
    }

    public Room(String roomno, char floor, int memberscount) {

        this.roomno = roomno;
        this.floor = floor;
        this.memberscount = memberscount;
    }
}
