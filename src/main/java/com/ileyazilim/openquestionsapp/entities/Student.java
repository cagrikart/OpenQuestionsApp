package com.ileyazilim.openquestionsapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "students")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","quenstions"})
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;

    private String email;

    private String password;

    public Student(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }


}
