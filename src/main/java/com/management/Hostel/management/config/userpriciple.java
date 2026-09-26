package com.management.Hostel.management.config;

import com.management.Hostel.management.Entity.Login;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class userpriciple implements UserDetails {
    private final Login login;

    public userpriciple(Login login) {
        this.login=login;
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {


        return Collections.singleton(new SimpleGrantedAuthority("ROLE_"+login.getRole().toUpperCase()));
    }

    @Override
    public @Nullable String getPassword() {
        return login.getPassword();
    }

    @Override
    public String getUsername() {
        return login.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
