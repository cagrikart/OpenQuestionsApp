package com.ileyazilim.openquestionsapp.dto;

import lombok.Data;

@Data
public class AnswerOfTeacherRequest {
    private Long teacherId;
    private Long questionsId;
}
