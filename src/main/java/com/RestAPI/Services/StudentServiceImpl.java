package com.RestAPI.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestAPI.Repository.StudentRepository;
import com.RestAPI.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentrepo;
	@Override
	public void savestudent(Student student) {
		studentrepo.save(student);
	}
	
	
	@Override
	public List<Student> findAllStudents() {
		List<Student> findAll = studentrepo.findAll();
		return findAll;
	}


	@Override
	public void deletestudent(long id) {
		studentrepo.deleteById(id);
		
	}


	@Override
	public Student findstudentById(long id) {
		Optional<Student> findById = studentrepo.findById(id);
		Student student = findById.get();
		return student;
	}


	
	}


