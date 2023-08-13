package com.ileyazilim.openquestionsapp.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class LoginSecurityServiceConfig {
    public static Authentication getAuthenticatedUserInfo() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
