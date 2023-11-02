package com.springapi.springbootapi.repository;

import com.springapi.springbootapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
