package com.ileyazilim.openquestionsapp.controller;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.AnswerOfTeacherRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsResponse;
import com.ileyazilim.openquestionsapp.entities.Quenstions;
import com.ileyazilim.openquestionsapp.service.abstracts.QuenstionsService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quenstions")
@AllArgsConstructor
public class QuenstionsController {
    private QuenstionsService quenstionsService;

    @GetMapping("/listQuenstions")
    public DataResult<List<QuenstionsResponse>> listQuenstions() {
        return this.quenstionsService.getQuenstions();
    }

    @PostMapping("/postStudentQuenstions")
    @ApiOperation(value = "Öğrenci soru sorarken kullanılacak içide  \"examId\": 0,\n" +
            "  \"lessonsId\": 0,\n" +
            "  \"studentId\": 0,\n" +
            "  \"teacherId\": 0,\n" +
            "  \"typeOfAnswerId\": 0 vardır ")
    public Result postQuenstions(@RequestBody QuenstionsRequest quenstionsRequest) {
        return this.quenstionsService.postQuenstions(quenstionsRequest);
    }

    @PostMapping("/answerOfTeacher")
    @ApiOperation(value ="Öğretmenin cevabı burda questionsId ve teacher Id var burada bunların olmasını" +
            " sebebi ise zaten questionId içinde typeofansweri nasıl cevaplayacağı var onun için böyle yaptım ")
    public Result answerOfTeacher(@RequestBody AnswerOfTeacherRequest request) {
        return this.quenstionsService.answerOfTeacher(request);
    }

}
