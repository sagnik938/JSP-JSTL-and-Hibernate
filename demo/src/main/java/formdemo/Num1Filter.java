package formdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class Num1Filter
 */
//specify url of servlet that filter acts on...
@WebFilter("/add")
public class Num1Filter extends HttpFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Inside filter");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		if (num1 >= 1) {
			chain.doFilter(request, response);
		} else {
			PrintWriter out = response.getWriter();
			out.println("Invalid input");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
