package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.*;

public interface StudentService{
    Student poststudent(Student st);
    List<Student> getAllStudents();
    Optional<Student> getById(Long id);
}