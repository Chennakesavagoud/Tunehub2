package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String username;
	int marks;
	String password;
	String schoolname;
	String branch;
	String classname;
	String address;
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param username
	 * @param marks
	 * @param password
	 * @param schoolname
	 * @param branch
	 * @param classname
	 * @param address
	 */
	public Student(String username, int marks, String password, String schoolname, String branch, String classname,
			String address) {
		this.username = username;
		this.marks = marks;
		this.password = password;
		this.schoolname = schoolname;
		this.branch = branch;
		this.classname = classname;
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", marks=" + marks + ", password=" + password + ", schoolname="
				+ schoolname + ", branch=" + branch + ", classname=" + classname + ", address=" + address + "]";
	}
	

}
