package com.management.Hostel.management.Repository;

import com.management.Hostel.management.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adminrepo extends JpaRepository<Admin,Integer> {

}
