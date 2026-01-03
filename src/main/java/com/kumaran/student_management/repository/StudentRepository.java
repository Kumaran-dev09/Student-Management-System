package com.kumaran.student_management.repository;

import org.springframework.data.repository.CrudRepository;

import com.kumaran.student_management.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
