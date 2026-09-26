package com.management.Hostel.management.model;

public class roomdto {
    private String roomno;
    private char floor;
    private int membercount;

    public roomdto() {
    }

    public roomdto(String roomno, char floor, int membercount) {
        this.roomno = roomno;
        this.floor = floor;
        this.membercount = membercount;
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

    public int getMembercount() {
        return membercount;
    }

    public void setMembercount(int membercount) {
        this.membercount = membercount;
    }
}
