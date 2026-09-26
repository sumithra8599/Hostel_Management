package com.management.Hostel.management.config;

import com.management.Hostel.management.model.logindto;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.stereotype.Service;

@Service
public class authentication {
    final AuthenticationManager authenticationManager;

    public authentication(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public String login(logindto logindto){
        Authentication authentication= authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        logindto.getUsername(),
                        logindto.getPassword()));
        SecurityContext context= SecurityContextHolder.createEmptyContext();
        context.setAuthentication(authentication);
        SecurityContextHolder.setContext(context);

        return "login successfully";
    }

}
