package com.ms3.bootcamp.authentication;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER,
    ADMIN;

    public String getAuthority() {
        return name();
    }
}
