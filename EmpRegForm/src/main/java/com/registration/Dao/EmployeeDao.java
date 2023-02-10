package com.registration.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.registration.model.Employee;

public class EmployeeDao {
	static int i = 100;

	public int registerEmployee(Employee e) throws ClassNotFoundException {
		String insert_emp_sql = "insert into employeenew values(?,?,?,?,?,?,?)";
		int res = 0;
		Class.forName("oracle.jdbc.driver.OracleDriver");

		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl.NRIFINTECH.COM",
				"SYSTEM", "Najanaja#28")) {
			PreparedStatement psmt = connection.prepareStatement(insert_emp_sql);
			psmt.setInt(1, EmployeeDao.i++);
			psmt.setString(2, e.getFirstname());
			psmt.setString(3, e.getLastname());
			psmt.setString(4, e.getUsername());
			psmt.setString(5, e.getPassword());
			psmt.setString(6, e.getAddress());
			psmt.setString(7, e.getContact());
//			System.out.println(psmt.);
			res = psmt.executeUpdate();

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return (res);
	}
}
