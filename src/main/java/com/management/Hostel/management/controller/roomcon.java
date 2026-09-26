package com.management.Hostel.management.controller;

import com.management.Hostel.management.Entity.Room;
import com.management.Hostel.management.model.roomdto;
import com.management.Hostel.management.service.roomservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/room")
public class roomcon {
    @Autowired
    roomservice service;
    @GetMapping("/creation")
    public String starting(){
        return service.roomdetail();
    }
    @GetMapping("/details")
    public ResponseEntity<List<roomdto>> getvalue(){
        return ResponseEntity.ok(service.getting());
    }
}
