package com.ileyazilim.openquestionsapp.util;

import com.ileyazilim.openquestionsapp.dto.TeacherRequest;
import com.ileyazilim.openquestionsapp.dto.TeacherResponse;
import com.ileyazilim.openquestionsapp.entities.Teacher;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapperUtil {
    public Teacher postTeacher(TeacherRequest teacherRequest){
        Teacher teacher = new Teacher();
        teacher.setName(teacherRequest.getName());
        return teacher;
    }
    public static TeacherResponse listTeacher (Teacher teacher) {
        TeacherResponse teacherResponse = new TeacherResponse();
        teacherResponse.setName(teacher.getName());
        return teacherResponse;
    }
}
