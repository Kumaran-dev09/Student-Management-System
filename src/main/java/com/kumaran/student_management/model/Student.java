package com.kumaran.student_management.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("student")
public class Student {

    @Id
    private Long id;

    private String name;
    private String email;
    private String course;
    private String phone;
}
