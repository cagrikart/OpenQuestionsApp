package com.ileyazilim.openquestionsapp.controller;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.ExamRequest;
import com.ileyazilim.openquestionsapp.entities.Exam;
import com.ileyazilim.openquestionsapp.service.abstracts.ExamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exam")
@AllArgsConstructor
public class ExamController{
    private ExamService examService;

    @GetMapping("/listExam")
    public DataResult<List<Exam>> listExam() {
        return this.examService.listExam();
    }

    @PostMapping("/postExam")
    public Result postExam(@RequestBody ExamRequest examRequest) {
        return this.examService.postExam(examRequest);
    }
}
