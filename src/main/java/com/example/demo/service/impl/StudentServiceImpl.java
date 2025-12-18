package com.example.demo.service.impl;

import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import java.util.*;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository stdrepo;
    @Override
    public Student poststudent(Student st){
        return stdrepo.save(st);
    }
    @Override
    public List<Student> getAllStudents(){
        return stdrepo.findAll();
    }
    @Override
    public Optional<Student> getById(Long id){
        return stdrepo.findById(id);
    }
    public String updateData(Long id,Student st){
        boolean status=stdrepo.existsById(id);
        if(status){
            st.setId(id);
            stdrepo.save(st);
            return "Student updated successfully";
        }else{
            return "Student witd ID "+id+" not found ";
        }
    }
    @Override
    public String deleteData(Long id){
    
    }
}