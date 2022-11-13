package com.amitu.springboot.controller;

import com.amitu.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(1,"Amit","Upadhyay");
        return student;
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Amit", "Upadhyay"));
        students.add(new Student(2, "Sumit", "Upadhyay"));
        students.add(new Student(3, "Rahul", "Dravid"));
        students.add(new Student(4, "Hardik", "Pandya"));

        return  students;
    }



}
