package com.ileyazilim.openquestionsapp.service.abstracts;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.TeacherRequest;
import com.ileyazilim.openquestionsapp.entities.Teacher;

import javax.xml.crypto.Data;
import java.util.List;

public interface TeacherService {
    DataResult<List<Teacher>> listTeacher();
    Result postTeacher(TeacherRequest teacherRequest);
}
