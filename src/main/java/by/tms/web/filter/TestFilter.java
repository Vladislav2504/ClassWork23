package by.tms.web.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(servletNames = "CalculatorServlet")
public class TestFilter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter");
		resp.sendRedirect("/");
//		chain.doFilter(req, resp);
	}
}
