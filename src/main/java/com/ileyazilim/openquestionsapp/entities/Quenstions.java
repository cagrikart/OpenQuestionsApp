package com.ileyazilim.openquestionsapp.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Quenstions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_id", referencedColumnName = "id")
    private Exam exam;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lessons_id", referencedColumnName = "id")
    private Lessons lessons;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "typeOfAnswer_id", referencedColumnName = "id")
    private TypeOfAnswer typeOfAnswer;
}
