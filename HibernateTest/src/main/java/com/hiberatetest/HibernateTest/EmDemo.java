package com.hiberatetest.HibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void putData(Student s, Session session, Transaction tx) {
		session.save(s);
		tx.commit();
		session.close();
		System.out.println("Creation done");
	}

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/hiberatetest/HibernateTest/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Certificate certificate = new Certificate("Hibernate", "10days");
		Student s = new Student(101, "Swairik", "Kol", certificate);

		Certificate certificate2 = new Certificate("JSP", "15days");
		Student s2 = new Student(102, "Sagnik", "Del", certificate2);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		putData(s, session, tx);
	}
}
