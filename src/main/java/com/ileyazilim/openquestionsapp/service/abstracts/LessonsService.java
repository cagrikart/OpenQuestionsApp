package com.ileyazilim.openquestionsapp.service.abstracts;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.LessonsRequest;
import com.ileyazilim.openquestionsapp.entities.Lessons;

import java.util.List;

public interface LessonsService {
    DataResult<List<Lessons>> listLessons ();
    Result postLessons(LessonsRequest lessonsRequest);
}
