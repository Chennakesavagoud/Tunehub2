package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentsSerivice;

@Controller
public class StudentController {
	
	@Autowired
	StudentsSerivice service;
	@PostMapping("/register")
	public String addStudents(@ModelAttribute Student student)
	{
		service.addStudent(student);
	    return "home";
	
	
	

}
}























