package com.management.Hostel.management.controller;

import com.management.Hostel.management.Entity.counting;
import com.management.Hostel.management.service.countservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/attendancecount")
public class countcon {
    final countservice countservice;

    public countcon(countservice countservice) {
        this.countservice = countservice;
    }
    @GetMapping("/present")
    public ResponseEntity <List<counting>> getcount(){
        return ResponseEntity.ok(countservice.findit());
    }
    @GetMapping("/absent")
    public ResponseEntity<List<counting>> absentdetails(){
        return ResponseEntity.ok(countservice.absentpersons());
    }
}
