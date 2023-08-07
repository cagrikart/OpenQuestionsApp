package com.ileyazilim.openquestionsapp.util;

import com.ileyazilim.openquestionsapp.dto.LessonsRequest;
import com.ileyazilim.openquestionsapp.dto.LessonsResponse;
import com.ileyazilim.openquestionsapp.entities.Lessons;
import org.springframework.stereotype.Component;

@Component
public class LessonsMapperUtil {
    public Lessons postLessons(LessonsRequest request){
        Lessons lessons = new Lessons();
        lessons.setName(request.getName());
        return  lessons;
    }

    public static LessonsResponse listLessons(Lessons lessons){
        LessonsResponse response = new LessonsResponse();
        response.setName(lessons.getName());
        return response;
    }
}
