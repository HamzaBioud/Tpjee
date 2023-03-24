package com.example.demo.repository;

import com.example.demo.properties.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRep extends JpaRepository<Student,Long> {
}
