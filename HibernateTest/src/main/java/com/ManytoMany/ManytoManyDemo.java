package com.ManytoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManytoManyDemo {

	public static void getProj(int id, Session session) {
		Employee employee = (Employee) session.get(Employee.class, id);
		if (employee == null) {
			System.out.println("no data");
		} else {
			List<Project> projsList = employee.getProjects();
			projsList.stream().map(p -> p.getProjectName()).forEach(System.out::println);
		}

	}

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/ManytoMany/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setId(101);
		e2.setId(102);
		e1.setName("Raj");
		e2.setName("Taj");

		Project p1 = new Project();
		Project p2 = new Project();
		p1.setProjId(500);
		p2.setProjId(501);
		p1.setProjectName("Project 1");
		p2.setProjectName("Project 2");

		List<Employee> employees = new ArrayList<Employee>();
		List<Project> projects = new ArrayList<Project>();

		employees.add(e1);
		employees.add(e2);

		projects.add(p1);
		projects.add(p2);

		e1.setProjects(projects);
		e2.setProjects(projects);
		p1.setEmployees(employees);
		p2.setEmployees(employees);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(p1);
		session.save(p2);
		session.save(e1);
		session.save(e2);
		transaction.commit();

		getProj(101, session);
		// getEmployees(500);

	}

}
