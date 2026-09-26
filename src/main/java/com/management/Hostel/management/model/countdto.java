package com.management.Hostel.management.model;

public class countdto {
    private  Integer id;
    private String name;
    private String roomno;

    public countdto() {
    }

    public countdto(Integer id, String name, String roomno) {
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
