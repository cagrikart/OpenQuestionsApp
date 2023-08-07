package com.ileyazilim.openquestionsapp.controller;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.TeacherRequest;
import com.ileyazilim.openquestionsapp.entities.Teacher;
import com.ileyazilim.openquestionsapp.service.abstracts.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
@AllArgsConstructor
public class TeacherController   {
    private TeacherService teacherService;

    @GetMapping("/listTeacher")
    public DataResult<List<Teacher>> listTeacher() {
        return teacherService.listTeacher();
    }

    @PostMapping("/postTeacher")
    public Result postTeacher(@RequestBody TeacherRequest teacherRequest) {
        return teacherService.postTeacher(teacherRequest);
    }
}
