package com.ileyazilim.openquestionsapp.controller;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.TypeOfAnswerRequest;
import com.ileyazilim.openquestionsapp.entities.TypeOfAnswer;
import com.ileyazilim.openquestionsapp.service.abstracts.TypeOfAnswerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typeOfAnswer")
@AllArgsConstructor
public class TypeOfAnswerController  {
    private TypeOfAnswerService typeOfAnswerService;

    @GetMapping("/listTypeOfAnswer")
    public DataResult<List<TypeOfAnswer>> listTypeOfAnswer() {
        return typeOfAnswerService.listTypeOfAnswer();
    }

    @PostMapping("/postTypeOfAnswer")
    public Result postTypeOfAnswer(@RequestBody TypeOfAnswerRequest typeOfAnswerRequest) {
        return typeOfAnswerService.postTypeOfAnswer(typeOfAnswerRequest);
    }
}
