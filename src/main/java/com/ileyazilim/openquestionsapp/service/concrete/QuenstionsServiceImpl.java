package com.ileyazilim.openquestionsapp.service.concrete;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.ErrorResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessDataResult;
import com.ileyazilim.openquestionsapp.dto.AnswerOfTeacherRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsRequest;
import com.ileyazilim.openquestionsapp.dto.QuenstionsResponse;
import com.ileyazilim.openquestionsapp.entities.*;
import com.ileyazilim.openquestionsapp.repository.*;
import com.ileyazilim.openquestionsapp.service.abstracts.QuenstionsService;
import com.ileyazilim.openquestionsapp.util.QuenstionsMapperUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class QuenstionsServiceImpl implements QuenstionsService {
    private QuenstionsRepository quenstionsRepository;
    private ExamRepository examRepository;
    private TeacherRepository teacherRepository;
    private TypeOfAnswerRepository typeOfAnswerRepository;
    private LessonsRepository lessonsRepository;
    private QuenstionsMapperUtil mapperUtil;
    private StudentRepository studentRepository;

    @Override
    public DataResult<List<QuenstionsResponse>> getQuenstions() {
        List<Quenstions> quenstions = this.quenstionsRepository.findAll();
        List<QuenstionsResponse> responses = quenstions.stream().map(mapperUtil::listQuenstions).collect(Collectors.toList());
        return new SuccessDataResult<>(responses, "listed quenstions");
    }

    @Override
    public Result postQuenstions(QuenstionsRequest request) {
        try {
            Optional<Student> studentOptional = studentRepository.findById(request.getStudentId());
            if (!studentOptional.isPresent()) {
                return new ErrorResult("Student not found");
            }

            Student student = studentOptional.get();

            Optional<Exam> examOptional = examRepository.findById(request.getExamId());
            if (!examOptional.isPresent()) {
                return new ErrorResult("Exam not found");
            }

            Optional<Lessons> lessonsOptional = lessonsRepository.findById(request.getLessonsId());
            if (!lessonsOptional.isPresent()) {
                return new ErrorResult("Lessons not found");
            }

            Optional<Teacher> teacherOptional = teacherRepository.findById(request.getTeacherId());
            if (!teacherOptional.isPresent()) {
                return new ErrorResult("Teacher not found");
            }

            Optional<TypeOfAnswer> typeOfAnswerOptional = typeOfAnswerRepository.findById(request.getTypeOfAnswerId());
            if (!typeOfAnswerOptional.isPresent()) {
                return new ErrorResult("Type of answer not found");
            }

            Quenstions questions = new Quenstions();
            questions.setExam(examOptional.get());
            questions.setLessons(lessonsOptional.get());
            questions.setTeacher(teacherOptional.get());
            questions.setTypeOfAnswer(typeOfAnswerOptional.get());
            questions.setStudent(student);

            Quenstions savedQuestions = quenstionsRepository.save(questions);
            return new SuccessDataResult<>(savedQuestions, "Questions added");
        } catch (Exception e) {
            return new ErrorResult("Questions not added ");
        }
    }
    @Override
    public Result answerOfTeacher(AnswerOfTeacherRequest request) {

        Optional<Quenstions> quenstionsOptional =quenstionsRepository.findById(request.getQuestionsId());
        if (!quenstionsOptional.isPresent()){
            return new ErrorResult("Questions not found");
        }
        Optional<Teacher> teacherOptional = teacherRepository.findById(request.getTeacherId());
        if (!teacherOptional.isPresent()) {
            return new ErrorResult("Teacher not found");
        }
        Teacher teacherDb =teacherOptional.get();
        Teacher teacher = new Teacher();
        teacher.setQuenstions(quenstionsOptional.get());
        Teacher savedAnswerOfTeacher = teacherRepository.save(teacherDb);
        return new SuccessDataResult<>(savedAnswerOfTeacher,"added Answer Of Teacher ");
    }


}
