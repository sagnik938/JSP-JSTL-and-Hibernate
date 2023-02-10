package com.form.assignment;

public class Student {
	String name;
	String password;
	String email;
	String gender;
	String course;
	
	public Student(String name, String password, String email, String gender, String course) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student"+ "\n" + "name=" + name + ", password=" + password + ", email=" + email + ", gender=" + gender
				+ ", course=" + course;
	}

}
