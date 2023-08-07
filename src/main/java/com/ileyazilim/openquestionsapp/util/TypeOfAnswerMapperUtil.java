package com.ileyazilim.openquestionsapp.util;

import com.ileyazilim.openquestionsapp.dto.TypeOfAnswerRequest;
import com.ileyazilim.openquestionsapp.dto.TypeOfAnswerResponse;
import com.ileyazilim.openquestionsapp.entities.TypeOfAnswer;
import org.springframework.stereotype.Component;

@Component
public class TypeOfAnswerMapperUtil {
    public TypeOfAnswer postTypeOfAnswer(TypeOfAnswerRequest typeOfAnswerRequest){
        TypeOfAnswer typeOfAnswer = new TypeOfAnswer();
        typeOfAnswer.setName(typeOfAnswerRequest.getName());
        return typeOfAnswer;
    }

    public static TypeOfAnswerResponse listTypeOfAnswer(TypeOfAnswer typeOfAnswer) {
        TypeOfAnswerResponse  typeOfAnswerResponse = new TypeOfAnswerResponse();
        typeOfAnswerResponse.setName(typeOfAnswer.getName());
        return typeOfAnswerResponse;
    }
}
