package com.ileyazilim.openquestionsapp.util;

import com.ileyazilim.openquestionsapp.dto.ExamRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsResponse;
import com.ileyazilim.openquestionsapp.entities.*;
import com.ileyazilim.openquestionsapp.repository.ExamRepository;
import com.ileyazilim.openquestionsapp.repository.LessonsRepository;
import com.ileyazilim.openquestionsapp.repository.TeacherRepository;
import com.ileyazilim.openquestionsapp.repository.TypeOfAnswerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class QuenstionsMapperUtil {
    private ExamRepository examRepository;
    private LessonsRepository lessonsRepository;
    private TeacherRepository teacherRepository;
    private TypeOfAnswerRepository typeOfAnswerRepository;

    public Quenstions postQuenstions(QuenstionsRequest request) {
        Quenstions quenstions = new Quenstions();
        Optional<Exam> examOptional = examRepository.findById(request.getExamId());
        Optional<Lessons> lessonsOptional = lessonsRepository.findById(request.getLessonsId());
        Optional<Teacher> teacherOptional = teacherRepository.findById(request.getTeacherId());
        Optional<TypeOfAnswer> typeOfAnswerOptional = typeOfAnswerRepository.findById(request.getTypeOfAnswerId());
        if (examOptional.isPresent() && lessonsOptional.isPresent() && teacherOptional.isPresent()
                && typeOfAnswerOptional.isPresent()) {
            quenstions.setExam(examOptional.get());
            quenstions.setLessons(lessonsOptional.get());
            quenstions.setTeacher(teacherOptional.get());
            quenstions.setTypeOfAnswer(typeOfAnswerOptional.get());
        }
        return quenstions;
    }

    public  QuenstionsResponse listQuenstions(Quenstions quenstions) {
        QuenstionsResponse response = new QuenstionsResponse();
        response.setExamId(quenstions.getExam().getId());
        response.setLessonsId(quenstions.getLessons().getId());
        response.setTeacherId(quenstions.getTeacher().getId());
        response.setTypeOfAnswerId(quenstions.getTypeOfAnswer().getId());
        return response;

    }

}
