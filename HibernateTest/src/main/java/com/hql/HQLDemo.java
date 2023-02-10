package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/hql/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

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

//		String query = "from Student where city=:x";
//		Query query2 = session.createQuery(query);
//		query2.setParameter("x", "Kol");
//		List<Student> ls = query2.list();
//		ls.stream().map(s -> s.getName()).forEach(System.out::println);
//		session.close();

//		/* Update */
//		String query = "update Student set city=:x where id=:y";
//		Query query2 = session.createQuery(query);
//		query2.setParameter("y", 101);
//		query2.setParameter("x", "Jaipur");
//		int count = query2.executeUpdate();
//		System.out.println(count);
//		transaction.commit();
//		session.close();

		/* Join */
		Query q4 = session.createQuery(
				"select q.questionID , q.questionContent, a.answerContent from Question as q Inner Join q.answer as a");
		List<Object[]> l4 = q4.getResultList();
		for (Object[] arr : l4) {
			System.out.println(Arrays.toString(arr));
		}
		session.close();
	}
}