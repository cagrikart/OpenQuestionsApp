package com.ileyazilim.openquestionsapp.service.concrete;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessDataResult;
import com.ileyazilim.openquestionsapp.dto.LessonsRequest;
import com.ileyazilim.openquestionsapp.entities.Lessons;
import com.ileyazilim.openquestionsapp.repository.LessonsRepository;
import com.ileyazilim.openquestionsapp.service.abstracts.LessonsService;
import com.ileyazilim.openquestionsapp.util.LessonsMapperUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LessonsServiceImpl implements LessonsService {
    private LessonsRepository lessonsRepository;
    private LessonsMapperUtil mapperUtil;
    @Override
    public DataResult<List<Lessons>> listLessons() {
        return new SuccessDataResult<List<Lessons>>(this.lessonsRepository.findAll(),"lessons listed");
    }

    @Override
    public Result postLessons(LessonsRequest lessonsRequest) {
        Lessons lessons = mapperUtil.postLessons(lessonsRequest);
        Lessons savedLessons = this.lessonsRepository.save(lessons);
        return new SuccessDataResult<>(savedLessons,"lessons added");
    }
}
