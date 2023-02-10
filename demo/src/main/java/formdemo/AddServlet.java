package formdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int result = a + b;
		// System.out.println(result);

		try {
			PrintWriter out = res.getWriter();
			out.println("Result is " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// req.setAttribute("result",result);
		// RequestDispatcher reqD = req.getRequestDispatcher("/square");

//		try {
//			reqD.forward(req,res);
//		} catch (ServletException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		try {
////			res.sendRedirect("square?result="+result); //url rewriting
//			res.sendRedirect("square");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		/**
		 * Session Management-> HttpSession-> Interface maintained by tomcat server.
		 * Cookies
		 */

		// Http session->Internally managed by tomcat server
//		try {
//			HttpSession session1 = req.getSession();
//			session1.setAttribute("result", result);
//			res.sendRedirect("square");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// cookies->cookie object along with response->nextreq+cookie->remember
		try {
			Cookie cookie = new Cookie("result", result + "");
			res.addCookie(cookie);
			res.sendRedirect("square");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
