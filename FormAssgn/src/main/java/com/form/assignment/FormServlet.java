package com.form.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class FormServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res ) {

		String name = req.getParameter("name");
		String pass = req.getParameter("password");
		String email = req.getParameter("email");
		String Gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String chck = req.getParameter("chck1");
		
		Student s = new Student(name, pass, email, Gender, course);
		
		try {
			PrintWriter out = res.getWriter();
			if( chck == null) {
				out.println("Not agreed to terms and conditions");
			}
			else {
				out.println(s.toString());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
