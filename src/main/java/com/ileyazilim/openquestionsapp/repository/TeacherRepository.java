package com.ileyazilim.openquestionsapp.repository;

import com.ileyazilim.openquestionsapp.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository  extends JpaRepository<Teacher,Long> {
}
