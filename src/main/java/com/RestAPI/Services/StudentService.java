package com.RestAPI.Services;

import java.util.List;

import com.RestAPI.entity.Student;

public interface StudentService {
public void savestudent(Student student);
public List<Student> findAllStudents();
public void deletestudent(long id);
public Student findstudentById(long id);

}
