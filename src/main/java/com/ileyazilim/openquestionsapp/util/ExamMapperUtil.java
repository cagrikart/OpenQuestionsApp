package com.ileyazilim.openquestionsapp.util;

import com.ileyazilim.openquestionsapp.dto.ExamRequest;
import com.ileyazilim.openquestionsapp.dto.ExamResponse;
import com.ileyazilim.openquestionsapp.entities.Exam;
import org.springframework.stereotype.Component;

@Component
public class ExamMapperUtil {

    public Exam postExam(ExamRequest request){
        Exam exam = new Exam();
        exam.setName(request.getName());
        return exam;
    }

    public static ExamResponse listExam(Exam exam){
        ExamResponse examResponse = new ExamResponse();
        examResponse.setName(exam.getName());
        return examResponse;
    }
}
