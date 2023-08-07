package com.ileyazilim.openquestionsapp.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Exam {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "exam")
    private Quenstions quenstions;

}
