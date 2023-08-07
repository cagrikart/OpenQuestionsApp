package com.ileyazilim.openquestionsapp.controller;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.dto.QuenstionsRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsResponse;
import com.ileyazilim.openquestionsapp.entities.Quenstions;
import com.ileyazilim.openquestionsapp.service.abstracts.QuenstionsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quenstions")
@AllArgsConstructor
public class QuenstionsController{
    private QuenstionsService quenstionsService;

    @GetMapping("/listQuenstions")
    public DataResult<List<QuenstionsResponse>> listQuenstions() {
        return this.quenstionsService.getQuenstions();
    }

    @PostMapping("/postQuenstions")
    public Result postQuenstions(@RequestBody QuenstionsRequest quenstionsRequest) {
        return this.quenstionsService.postQuenstions(quenstionsRequest);
    }
}
