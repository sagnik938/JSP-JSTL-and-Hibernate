package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SqlNativeQueryDemo {

	public static void main(String[] args) {
		List<Object> resList;
		Configuration cfg = new Configuration();
		cfg.configure("com/hql/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		String queryString = "select * from project";
		NativeQuery nativeQuery = session.createSQLQuery(queryString);
		resList = nativeQuery.list();
		resList.stream().forEach(System.out::println);
	}

}
