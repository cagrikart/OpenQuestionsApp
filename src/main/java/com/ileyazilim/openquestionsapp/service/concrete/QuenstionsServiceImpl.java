package com.ileyazilim.openquestionsapp.service.concrete;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessDataResult;
import com.ileyazilim.openquestionsapp.dto.QuenstionsRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsResponse;
import com.ileyazilim.openquestionsapp.entities.Quenstions;
import com.ileyazilim.openquestionsapp.repository.QuenstionsRepository;
import com.ileyazilim.openquestionsapp.service.abstracts.QuenstionsService;
import com.ileyazilim.openquestionsapp.util.QuenstionsMapperUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class QuenstionsServiceImpl implements QuenstionsService {
    private QuenstionsRepository quenstionsRepository;
    private QuenstionsMapperUtil  mapperUtil;
    @Override
    public DataResult<List<QuenstionsResponse>> getQuenstions() {
        List<Quenstions> quenstions = this.quenstionsRepository.findAll();
        List<QuenstionsResponse> responses = quenstions.stream().map( mapperUtil::listQuenstions ).collect(Collectors.toList());
        return new SuccessDataResult<>(responses,"listed quenstions");
    }

    @Override
    public Result postQuenstions(QuenstionsRequest quenstionsRequest) {
        Quenstions quenstions = mapperUtil.postQuenstions(quenstionsRequest);
        Quenstions savedQuenstions = this.quenstionsRepository.save(quenstions);
        return new SuccessDataResult<>(savedQuenstions,"added quenstions");
    }
}
