package com.management.Hostel.management.controller;

import com.management.Hostel.management.model.Admindto;
import com.management.Hostel.management.service.adminservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class admincon {
    String lastmessage;
    @Autowired
    adminservice service;
    @PostMapping("/msgsenter")
    public String senter(String message){
        lastmessage=message;
        return "sent...";
    }
    @GetMapping("/msg")
    public String alter(){
        return lastmessage;
    }

    @GetMapping("/sample")
    public ResponseEntity<String> idea(){
    return ResponseEntity.ok(service.stored());
}

    @GetMapping("/getalldetails")
    public ResponseEntity<List<Admindto>> details(){
        return ResponseEntity.ok(service.getall());
    }
    @PostMapping("/adduser")
    public Admindto creation(@RequestBody Admindto adminmodel){
        return service.add(adminmodel);
    }


    @GetMapping("/check/{roomno}")
    public ResponseEntity<Long> checking(@PathVariable String roomno){
       Long response= service.count(roomno);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletion(@PathVariable Integer id){

        return ResponseEntity.ok(service.deleted(id));
    }

}
