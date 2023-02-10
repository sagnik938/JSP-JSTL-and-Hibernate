package formdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * gets the metadata to map the servlet. No need to map in web.xml. Tomcat has
 * servlet containers that resolves this.
 */

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		// int r = (int)(req.getAttribute("result"));
		// String result = req.getParameter("result");

//		HttpSession session = req.getSession();
//		int result = (int)(session.getAttribute("result"));

		Cookie cookies[] = req.getCookies();
		int r = 0;
		for (Cookie c : cookies) {
			if (c.getName().equals("result")) {
				r = Integer.parseInt(c.getValue());
			}
		}

		try {
			PrintWriter out = res.getWriter();
			// Embedding some html...
			out.println("<html><body bgcolor = blue>");
			out.println("In sq servlet " + r);
			out.println("</html></body>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
