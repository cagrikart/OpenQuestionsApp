package com.ileyazilim.openquestionsapp.service.concrete;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessDataResult;
import com.ileyazilim.openquestionsapp.dto.TypeOfAnswerRequest;
import com.ileyazilim.openquestionsapp.entities.TypeOfAnswer;
import com.ileyazilim.openquestionsapp.repository.TypeOfAnswerRepository;
import com.ileyazilim.openquestionsapp.service.abstracts.TypeOfAnswerService;
import com.ileyazilim.openquestionsapp.util.TypeOfAnswerMapperUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TypeOfAnswerServiceImpl implements TypeOfAnswerService {
    private TypeOfAnswerRepository typeOfAnswerRepository;
    private TypeOfAnswerMapperUtil mapperUtil;
    @Override
    public DataResult<List<TypeOfAnswer>> listTypeOfAnswer() {
        return new SuccessDataResult<List<TypeOfAnswer>>(typeOfAnswerRepository.findAll(),"listed type of answer ");
    }

    @Override
    public Result postTypeOfAnswer(TypeOfAnswerRequest typeOfAnswerRequest) {
        TypeOfAnswer typeOfAnswer = mapperUtil.postTypeOfAnswer(typeOfAnswerRequest);
        TypeOfAnswer savedTypeOfAnswer = typeOfAnswerRepository.save(typeOfAnswer);
        return new SuccessDataResult<>(savedTypeOfAnswer,"added TypeOfAnswe");
    }
}
