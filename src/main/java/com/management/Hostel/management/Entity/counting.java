package com.management.Hostel.management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class counting {
    @Id

    private  Integer id;
    private String name;
    private String roomno;

    public counting() {
    }

    public counting(Integer id, String name, String roomno) {
        this.id = id;
        this.name = name;
        this.roomno = roomno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }
}
