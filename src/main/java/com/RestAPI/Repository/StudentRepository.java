package com.RestAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestAPI.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
