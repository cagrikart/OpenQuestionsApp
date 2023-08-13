package com.ileyazilim.openquestionsapp.dto;

import lombok.Data;



@Data
public class QuenstionsRequest {
    private Long examId;
    private Long lessonsId;
    private Long teacherId;
    private Long studentId;
    private Long typeOfAnswerId;
}
