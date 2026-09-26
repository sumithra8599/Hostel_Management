package com.management.Hostel.management.config;

import com.management.Hostel.management.Entity.Login;
import com.management.Hostel.management.Repository.loginrepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class userservice implements UserDetailsService {

    final loginrepo repo;

    public userservice(loginrepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        Login login=repo.findByusername(username);
        if(login==null){
            throw new RuntimeException("invaild username");
        }


        return new userpriciple(login);
    }
}
