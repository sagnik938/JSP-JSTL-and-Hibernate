package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hiberatetest.HibernateTest.Student;

public class HQLDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/hiberatetest/HibernateTest/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

//		String query = "from Student";
//		Query query2 = session.createQuery(query);
//		List<Student> ls = query2.list();
//		ls.stream().map(s -> s.getName()).forEach(System.out::println);
//		session.close();

//		String query = "from Student where city='Kol'";
//		Query query2 = session.createQuery(query);
//		List<Student> ls = query2.list();
//		ls.stream().map(s -> s.getName()).forEach(System.out::println);
//		session.close();

		String query = "from Student where city=:x";
		Query query2 = session.createQuery(query);
		query2.setParameter("x", "Kol");
		List<Student> ls = query2.list();
		ls.stream().map(s -> s.getName()).forEach(System.out::println);
		session.close();

	}
}