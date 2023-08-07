package com.ileyazilim.openquestionsapp.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TypeOfAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "typeOfAnswer")
    private Quenstions quenstions;
}
