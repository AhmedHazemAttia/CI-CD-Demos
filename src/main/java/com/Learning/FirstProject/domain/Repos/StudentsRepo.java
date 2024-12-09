package com.Learning.FirstProject.domain.Repos;

import com.Learning.FirstProject.domain.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepo extends JpaRepository<Students, Long> {
    Students findById(Students studentId);
}
