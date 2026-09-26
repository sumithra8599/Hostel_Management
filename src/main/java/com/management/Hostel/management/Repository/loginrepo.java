package com.management.Hostel.management.Repository;

import com.management.Hostel.management.Entity.Attendance;
import com.management.Hostel.management.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginrepo extends JpaRepository<Login,Integer> {
    Login findByusername(String username);
}
