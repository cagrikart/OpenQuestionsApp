package com.ileyazilim.openquestionsapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {
    private String name;
    private String username;
    private String email;
    private String password;
    private Set<String> role;
}
