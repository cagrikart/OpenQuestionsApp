package com.ileyazilim.openquestionsapp.service.abstracts;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.AnswerOfTeacherRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsResponse;
import com.ileyazilim.openquestionsapp.entities.Quenstions;

import java.util.List;

public interface QuenstionsService {
    DataResult<List<QuenstionsResponse>> getQuenstions();
    Result postQuenstions(QuenstionsRequest request) ;
    Result answerOfTeacher(AnswerOfTeacherRequest request);
}
