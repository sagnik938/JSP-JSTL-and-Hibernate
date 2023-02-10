package com.ManytoMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	int projId;

	String projectName;

	@ManyToMany
	@JoinTable(name = "Proj_Emp_Relation", joinColumns = { @JoinColumn(name = "ProjId") }, inverseJoinColumns = {
			@JoinColumn(name = "EmpId") })
	List<Employee> employees;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projId, String projectName, List<Employee> employees) {
		super();
		this.projId = projId;
		this.projectName = projectName;
		this.employees = employees;
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projectName=" + projectName + ", employees=" + employees + "]";
	}

}
