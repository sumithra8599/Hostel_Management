package com.management.Hostel.management.service;

import com.management.Hostel.management.Entity.Room;
import com.management.Hostel.management.Repository.roomrepo;
import com.management.Hostel.management.model.Admindto;
import com.management.Hostel.management.model.roomdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class roomservice {
    @Autowired
    roomrepo repo;
    List <Room> rooms=new ArrayList<>();
    public String roomdetail(){
        rooms.add(new Room("A101",'A',3));
        rooms.add(new Room("A102",'A',0));
        rooms.add(new Room("A103",'A',0));
        rooms.add(new Room("B104",'B',0));
        rooms.add(new Room("B105",'B',0));
        rooms.add(new Room("B106",'B',0));
        rooms.add(new Room("C107",'C',0));
        rooms.add(new Room("C108",'C',0));
        rooms.add(new Room("C109",'C',0));
        rooms.add(new Room("C110",'C',0));
        repo.saveAll(rooms);
        return "successfully created";

    }

    public Room increase(String roomno){
        Room rooms =repo.findByroomno(roomno);

        if (rooms==null){
            throw new RuntimeException("ROOM NOT AVAILABLE" +roomno);
        }

        rooms.setMemberscount(rooms.getMemberscount()+1);
        return repo.save(rooms);

    }
    public Room deleted (Integer id){
        Room room=repo.findById(id).orElseThrow();
        if(room.getMemberscount()<=0){
            throw new RuntimeException("Room is already empty");
        }
        room.setMemberscount(room.getMemberscount()-1);
        return repo.save(room);
    }
    public List<roomdto> getting(){
        return repo.findAll().stream()
                .map(room -> new roomdto(
                        room.getRoomno(),
                        room.getFloor(),
                        room.getMemberscount()
                ))
                .toList();
    }
}
