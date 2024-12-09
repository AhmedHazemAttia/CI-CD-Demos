package com.Learning.FirstProject.controller;


import com.Learning.FirstProject.DTO.CreateStudentDto;
import com.Learning.FirstProject.domain.Entity.Students;
import com.Learning.FirstProject.mapper.StudentMapper;
import com.Learning.FirstProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentMapper studentMapper;

    @PostMapping("/add")
    public ResponseEntity<CreateStudentDto> addStudent(@RequestBody CreateStudentDto createStudentDto){
        Students students =studentService.saveStudent(studentMapper.toEntity(createStudentDto));
        return ResponseEntity.ok(studentMapper.toDTO(students));
    }

}
