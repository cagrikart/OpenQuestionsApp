package com.ileyazilim.openquestionsapp.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "teacher")
    private Quenstions quenstions;
}
