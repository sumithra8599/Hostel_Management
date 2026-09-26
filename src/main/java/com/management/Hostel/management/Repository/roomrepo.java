package com.management.Hostel.management.Repository;

import com.management.Hostel.management.Entity.Room;
import com.management.Hostel.management.model.roomdto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface roomrepo extends JpaRepository<Room,Integer> {
    Room findByroomno(String roomno);
}
