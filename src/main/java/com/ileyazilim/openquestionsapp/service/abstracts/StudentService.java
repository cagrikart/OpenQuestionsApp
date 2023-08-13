package com.ileyazilim.openquestionsapp.service.abstracts;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.LessonsRequest;
import com.ileyazilim.openquestionsapp.entities.Lessons;
import com.ileyazilim.openquestionsapp.entities.Student;

import java.util.List;

public interface StudentService {
    DataResult<List<Student>> listStudent ();
    Result postStudent(Student student);
}
