package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentsRepository;

@Service
public class StudentServicesImplementation implements StudentsSerivice{
	
	@Autowired
	StudentsRepository repo;
	@Override
	public String addStudent(Student student) {
		repo.save(student);
		return "student added successfully";
		
	}
	
	

}














