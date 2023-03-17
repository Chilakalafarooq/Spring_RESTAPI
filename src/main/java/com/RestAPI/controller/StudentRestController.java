package com.RestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPI.Repository.StudentRepository;
import com.RestAPI.entity.Student;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {
	
	@Autowired
	public StudentRepository studentRepo;
	//This is the api url
	//http://localhost:8080/api/students 
	
	
	//http://localhost:8080/api/students
	
	
	
	@GetMapping
	public  List<Student> getAllStudents() {
		List<Student> findAll = studentRepo.findAll();
		return findAll ;
		
	}	
		//http://localhost:8080/api/students
	//This method help us to perform  Insert operation in POSTMAN Tool
		@PostMapping
	public void saveOneStudent(@RequestBody Student student) {
			studentRepo.save(student);	
	}
		//http://localhost:8080/api/students
		//This method help us to perform update Operation in POSTMAN Tool
		@PutMapping
		public void updateOneStudent(@RequestBody Student student) {
			studentRepo.save(student);
}
		//http://localhost:8080/api/students/1
		//This method help us to perform delete operation in POSTMAN Tool
@DeleteMapping("/{id}")

public void deleteoneStudent(@PathVariable("id") long id) {
	studentRepo.deleteById(id);
}}