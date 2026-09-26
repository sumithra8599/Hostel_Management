package com.management.Hostel.management.controller;

import com.management.Hostel.management.Entity.Login;
import com.management.Hostel.management.config.authentication;
import com.management.Hostel.management.model.logindto;
import com.management.Hostel.management.service.loginservice;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class logincon {

    @Autowired
    loginservice loginser;

    @PostMapping("/logindetails")
    public ResponseEntity<Login> userlogindetaills(@RequestBody Login login){
        return ResponseEntity.ok(loginser.detailsdb(login));

    }
    @GetMapping("/get{id}")
    public ResponseEntity<Login> getting(@PathVariable Integer id){
        return ResponseEntity.ok(loginser.finding(id));

    }

}
