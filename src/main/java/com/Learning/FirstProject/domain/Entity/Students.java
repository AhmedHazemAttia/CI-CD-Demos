package com.Learning.FirstProject.domain.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    @Id
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="studentId", nullable = false)
    private Long studentId;
}