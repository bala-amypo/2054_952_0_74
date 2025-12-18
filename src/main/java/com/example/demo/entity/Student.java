package com.example.demo.entity;

import java.time.LocalDate;
import jakarta.validation.*;

import jakarta.persistence.*;
@Entity
public class Student{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Positive(message="dont enter negative values")
    private Long id;
    @NotBlank(message="enter some values correctly")
    private String name;
    @NotBlank(message="enter some values correctly")
    private String dept;
    @Past(message="you cannot be that young ")
    private LocalDate dob;
    @Positive(message="i know you are dumb you aint this dumb")
    private float cgpa;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public Student(){

    }
    public Student(Long id,String name,String dept,LocalDate dob,float cgpa){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.dob=dob;
        this.cgpa=cgpa;
    }
}