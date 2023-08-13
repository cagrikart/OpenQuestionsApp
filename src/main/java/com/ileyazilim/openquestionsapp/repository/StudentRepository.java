package com.ileyazilim.openquestionsapp.repository;

import com.ileyazilim.openquestionsapp.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
