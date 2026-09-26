package com.management.Hostel.management.controller;

import com.management.Hostel.management.Entity.Attendance;
import com.management.Hostel.management.model.attendacedto;
import com.management.Hostel.management.service.attendanceservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class attendancecon {
    final attendanceservice attenservice;

    public attendancecon(attendanceservice attenservice) {
        this.attenservice = attenservice;
    }

    @PostMapping
    public ResponseEntity<Attendance> attendance(@RequestBody attendacedto attend) throws Exception {
        return ResponseEntity.ok(attenservice.attendanceprocess(attend.getId(),attend.getUsername(),attend.getRoomno(),attend.getPassword()));

    }
    @GetMapping("/attandanedetails")
    public ResponseEntity <List<attendacedto>>getdetails(){
        return ResponseEntity.ok(attenservice.getattendace());
    }
}
