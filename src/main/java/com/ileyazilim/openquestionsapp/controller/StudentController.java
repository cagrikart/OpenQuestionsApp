package com.ileyazilim.openquestionsapp.controller;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessDataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessResult;
import com.ileyazilim.openquestionsapp.entities.Student;
import com.ileyazilim.openquestionsapp.repository.StudentRepository;
import com.ileyazilim.openquestionsapp.service.abstracts.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@AllArgsConstructor
public class StudentController {
    private StudentRepository studentRepository;

    @GetMapping("/listStudent")
    public DataResult<List<Student>> listStudent() {
        return new SuccessDataResult<List<Student>>(this.studentRepository.findAll(),"listelendi");
    }


}
