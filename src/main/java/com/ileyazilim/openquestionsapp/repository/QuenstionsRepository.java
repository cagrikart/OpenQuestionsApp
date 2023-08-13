package com.ileyazilim.openquestionsapp.repository;

import com.ileyazilim.openquestionsapp.entities.Quenstions;
import com.ileyazilim.openquestionsapp.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuenstionsRepository extends JpaRepository<Quenstions,Long> {

    //List<Student> findByStudentId(Long studentID);

}
