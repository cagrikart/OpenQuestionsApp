package com.ileyazilim.openquestionsapp.dto;

import com.ileyazilim.openquestionsapp.entities.Exam;
import com.ileyazilim.openquestionsapp.entities.Lessons;
import com.ileyazilim.openquestionsapp.entities.Teacher;
import com.ileyazilim.openquestionsapp.entities.TypeOfAnswer;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
public class QuenstionsRequest {

    private Long id;

    private Long examId;


    private Long lessonsId;



    private Long teacherId;


    private Long typeOfAnswerId;
}
