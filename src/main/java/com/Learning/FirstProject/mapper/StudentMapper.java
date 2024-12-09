package com.Learning.FirstProject.mapper;


import com.Learning.FirstProject.DTO.CreateStudentDto;
import com.Learning.FirstProject.domain.Entity.Students;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Students toEntity(CreateStudentDto studentDto);
    CreateStudentDto toDTO (Students students);
}
