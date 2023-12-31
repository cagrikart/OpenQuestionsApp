package com.ileyazilim.openquestionsapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;

    private String email;

    private String password;

    @OneToOne(mappedBy = "teacher")
    @JsonIgnore
    private Quenstions quenstions;


    public Teacher(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
