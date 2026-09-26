package com.management.Hostel.management.service;

import com.management.Hostel.management.Entity.Login;
import com.management.Hostel.management.Repository.loginrepo;
import com.management.Hostel.management.model.logindto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loginservice {

    final loginrepo loginrepo;
    final PasswordEncoder passwordEncoder;

    public loginservice(loginrepo loginrepo, PasswordEncoder passwordEncoder) {
        this.loginrepo = loginrepo;
        this.passwordEncoder = passwordEncoder;
    }

    public Login detailsdb(Login val) {

        Login login=new Login();
        login.setUsername(val.getUsername());
        login.setPassword(passwordEncoder.encode(val.getPassword()));
        login.setRole(val.getRole());
        return loginrepo.save(login);

    }


    public Login finding(Integer id) {
        return loginrepo.findById(id).orElseThrow();
    }

}


