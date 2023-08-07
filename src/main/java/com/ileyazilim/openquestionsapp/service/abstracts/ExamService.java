package com.ileyazilim.openquestionsapp.service.abstracts;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.ExamRequest;
import com.ileyazilim.openquestionsapp.entities.Exam;

import java.util.List;

public interface ExamService {
    DataResult<List<Exam>> listExam();
    Result postExam(ExamRequest examRequest);
}
