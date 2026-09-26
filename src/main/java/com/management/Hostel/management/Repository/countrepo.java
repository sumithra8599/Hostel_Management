package com.management.Hostel.management.Repository;

import com.management.Hostel.management.Entity.counting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface countrepo extends JpaRepository<counting,Integer> {
}
