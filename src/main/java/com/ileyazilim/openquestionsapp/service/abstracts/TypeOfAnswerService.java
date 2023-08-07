package com.ileyazilim.openquestionsapp.service.abstracts;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.TypeOfAnswerRequest;
import com.ileyazilim.openquestionsapp.entities.TypeOfAnswer;

import java.util.List;

public interface TypeOfAnswerService {
    DataResult<List<TypeOfAnswer>> listTypeOfAnswer();
    Result postTypeOfAnswer(TypeOfAnswerRequest typeOfAnswerRequest);
}
