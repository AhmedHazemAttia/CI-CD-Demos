package com.Learning.FirstProject.controller;


import com.Learning.FirstProject.domain.Entity.Students;
import com.Learning.FirstProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public void addStudent(Students student){
        studentService.saveStudent(student);
    }
}
