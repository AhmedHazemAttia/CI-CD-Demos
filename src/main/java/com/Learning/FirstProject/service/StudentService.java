package com.Learning.FirstProject.service;


import com.Learning.FirstProject.domain.Entity.Students;
import com.Learning.FirstProject.domain.Repos.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentsRepo studentsRepo;

    //save Student
    public Students saveStudent (Students student){
        return studentsRepo.save(student);
    }
    //get Student
    public Students getStudent (Students studentId){
        return studentsRepo.findById(studentId);
    }
}
