package com.ileyazilim.openquestionsapp.service.concrete;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessDataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessResult;
import com.ileyazilim.openquestionsapp.entities.Student;
import com.ileyazilim.openquestionsapp.repository.StudentRepository;
import com.ileyazilim.openquestionsapp.service.abstracts.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    @Override
    public DataResult<List<Student>> listStudent() {
        return new SuccessDataResult<List<Student>>(this.studentRepository.findAll());
    }

    @Override
    public Result postStudent(Student student) {
        this.studentRepository.save(student);
        return new SuccessResult("eklendi studentt ") ;
    }
}
