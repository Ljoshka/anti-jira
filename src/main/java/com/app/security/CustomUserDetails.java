package com.app.security;

import com.app.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {
    private User user;

    public CustomUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAutorities() {
        return null;
    }


        @Override
    public String getPassword() {
            return user.getPassword();
        }

        @Override
    public String getUserName() {
        return user.getEmail();
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
    public boolean isCredentialNonExpired() {
        return true;
        }

        @Override
    public boolean isEnabled() {
        return true;
        }
}