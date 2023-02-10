package com.ManytoMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emphbr")
public class Employee {

	@Id
	int id;
	String name;

	@ManyToMany
	@JoinTable(name = "Emp_Proj_Relation", joinColumns = { @JoinColumn(name = "EmpId") }, inverseJoinColumns = {
			@JoinColumn(name = "projId") })
	List<Project> projects;

	public Employee() {
		super();
	}

	public Employee(int id, String name, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
