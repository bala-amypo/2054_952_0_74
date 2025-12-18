package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import jakarta.cvalues.constraints.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService stdser;

    @PostMapping("/addStudent")
    public Student addStudent(@Valid,@RequestBody Student st) {
        return stdser.poststudent(st);
    }

    @GetMapping("/getall")
    public List<Student> getAll() {
        return stdser.getAllStudents();
    }

    @GetMapping("/getbyId/{id}")
    public Optional<Student> getId(@PathVariable Long id) {
        return stdser.getById(id);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id,@Valid,@RequestBody Student st){
        return stdser.updateData(id,st);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return stdser.deleteData(id);
    }
    }