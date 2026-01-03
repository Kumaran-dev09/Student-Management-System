package com.kumaran.student_management.service;

import com.kumaran.student_management.model.Student;

public interface StudentService {

    Student saveStudent(Student student);

    Iterable<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}
