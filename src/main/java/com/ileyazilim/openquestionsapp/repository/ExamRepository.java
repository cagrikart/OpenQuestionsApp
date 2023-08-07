package com.ileyazilim.openquestionsapp.repository;

import com.ileyazilim.openquestionsapp.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam,Long> {
}
