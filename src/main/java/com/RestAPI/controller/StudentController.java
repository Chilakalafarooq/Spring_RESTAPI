package com.RestAPI.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.RestAPI.Services.StudentService;
import com.RestAPI.entity.Student;
import com.RestAPI.entity.StudentDto;
import com.RestAPI.util.EmailService;

@Controller
public class StudentController {
@Autowired
	public StudentService studentservice;
@Autowired
private EmailService emailservice;

//localhost:8080/Viewstudentcreate
@RequestMapping("/Viewstudentcreate")
public String Viewstudentcreate() {
	return"Create_studentview";
	
}
//This is First method to store the data to the database.
//	@RequestMapping("/savestudent")
//	public String saveOneStudent(Student student) {
//		studentservice.savestudent(student);
//		return"Create_studentview";
	//}

//This is the Second method to store the data in database by using @modelAttribute annotation

//localhost:8080/Viewstudentcreate
//@RequestMapping(value = "/savestudent",method = RequestMethod.POST)
//public String saveOneStudent(StudentDto studentDto, ModelMap model) {
//	Student dto = new Student ();
//	dto.setFirstname(studentDto.getFirstname());
//	dto.setLastname(studentDto.getLastname());
//	dto.setEmail(studentDto.getEmail());
//	dto.setCity(studentDto.getCity());
//	dto.setContact(studentDto.getContact());
//	
//	model.addAttribute("msg","Record is Saved");
//	studentservice.savestudent(dto);
//	return"Create_studentview";
//	
//}
//This is the third method to save the data to the database
//localhost:8080/Viewstudentcreate
@RequestMapping("/savestudent")
public String saveOneStudent(@ModelAttribute("Student") Student student,ModelMap model) {
	studentservice.savestudent(student);
	model.addAttribute("msg","Record is saved");
	return"Create_studentview";


//}

//@RequestMapping("/savestudent")//It help us read the data in console.
//public String saveOneLead(@RequestParam("firstname") String firstname,
//		@RequestParam("lastname") String lastname,
//		@RequestParam("email") String email,
//		@RequestParam("contact") String contact,@RequestParam("City") String City) {
//	System.out.println(firstname);
//	System.out.println(lastname);
//	System.out.println(email);
//	System.out.println(contact);
//	System.out.println(City);
//	
//	return "Create_registration";
	
//By using these three methods to perform insert operation in database.
}

//This method help us to read all the data from database
//localhost:8080/list_allStudents
@RequestMapping("/list_allStudents")
public String getallStudents(Model model) {
	List<Student> students = studentservice.findAllStudents();
	model.addAttribute("students", students);
return"list_allStudents";
}


// This method help us to delete data in database

//Firstly we copy this url //localhost:8080/list_allStudents

//http://localhost:8080/delete?id=11
@RequestMapping("/delete")
public String deleteoneStudent(@RequestParam("id") long id,Model model) {
	studentservice.deletestudent(id);
	List<Student> Students = studentservice.findAllStudents();
	model.addAttribute("Students", Students);
	return "list_allStudents";
}
//This method help us to update the data tin database

//localhost:8080/list_allStudents
@RequestMapping("/update")
public String updateStudents(@RequestParam("id") long id,Model model) {
	Student students = studentservice.findstudentById(id);
	model.addAttribute("students", students);
	return"update_student";
}

@RequestMapping(value = "/savestudent",method = RequestMethod.POST)
public String saveOneStudent(StudentDto studentDto, ModelMap model) {
	Student dto = new Student ();
	dto.setFirstname(studentDto.getFirstname());
	dto.setLastname(studentDto.getLastname());
	dto.setEmail(studentDto.getEmail());
	//dto.setCity(studentDto.getCity());
	dto.setContact(studentDto.getContact());
	
	emailservice.Emailsend(studentDto.getEmail(),"Test", "Welcome");
	
	model.addAttribute("msg","Record is Saved");
	studentservice.savestudent(dto);
	return"Create_studentview";
	

}}