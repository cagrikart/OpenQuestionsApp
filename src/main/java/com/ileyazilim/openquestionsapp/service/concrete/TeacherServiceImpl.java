package com.ileyazilim.openquestionsapp.service.concrete;

import com.ileyazilim.openquestionsapp.core.utilities.results.DataResult;
import com.ileyazilim.openquestionsapp.core.utilities.results.Result;
import com.ileyazilim.openquestionsapp.core.utilities.results.SuccessDataResult;
import com.ileyazilim.openquestionsapp.dto.TeacherRequest;
import com.ileyazilim.openquestionsapp.entities.Teacher;
import com.ileyazilim.openquestionsapp.repository.TeacherRepository;
import com.ileyazilim.openquestionsapp.service.abstracts.TeacherService;
import com.ileyazilim.openquestionsapp.util.TeacherMapperUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private TeacherRepository teacherRepository;
    private TeacherMapperUtil mapperUtil;
    @Override
    public DataResult<List<Teacher>> listTeacher() {
        return new SuccessDataResult<List<Teacher>>(teacherRepository.findAll(),"listed of teacher");
    }

    @Override
    public Result postTeacher(TeacherRequest teacherRequest) {
        Teacher teacher = mapperUtil.postTeacher(teacherRequest);
        Teacher savedTeacher = teacherRepository.save(teacher);
        return new SuccessDataResult<>(savedTeacher,"added teacher");
    }
}
