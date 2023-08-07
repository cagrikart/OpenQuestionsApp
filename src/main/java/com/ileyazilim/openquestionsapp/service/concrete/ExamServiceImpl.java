package com.ileyazilim.openquestionsapp.service.concrete;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessDataResult;
import com.ileyazilim.openquestionsapp.dto.ExamRequest;
import com.ileyazilim.openquestionsapp.entities.Exam;
import com.ileyazilim.openquestionsapp.repository.ExamRepository;
import com.ileyazilim.openquestionsapp.service.abstracts.ExamService;
import com.ileyazilim.openquestionsapp.util.ExamMapperUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExamServiceImpl implements ExamService {

    private ExamRepository examRepository;
    private ExamMapperUtil mapperUtil;
    @Override
    public DataResult<List<Exam>> listExam() {

        return new SuccessDataResult<List<Exam>>(this.examRepository.findAll(),"exam listelendi");
    }

    @Override
    public Result postExam(ExamRequest examRequest) {
        Exam exam = mapperUtil.postExam(examRequest);
        Exam savedExam = this.examRepository.save(exam);
        return new SuccessDataResult<>(savedExam,"sınavlar eklendi");
    }
}
