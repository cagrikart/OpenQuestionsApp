package com.ileyazilim.openquestionsapp.controller;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.LessonsRequest;
import com.ileyazilim.openquestionsapp.entities.Lessons;
import com.ileyazilim.openquestionsapp.service.abstracts.LessonsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lessons")
@AllArgsConstructor
public class LessonsController {
    private LessonsService lessonsService;


    @GetMapping("/listLessons")
    public DataResult<List<Lessons>> listLessons() {
        return this.lessonsService.listLessons();
    }

    @PostMapping("/postLessons")
    public Result postLessons(@RequestBody LessonsRequest lessonsRequest) {
        return this.lessonsService.postLessons(lessonsRequest);
    }
}
