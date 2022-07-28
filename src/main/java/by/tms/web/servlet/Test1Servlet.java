package by.tms.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/test1")
public class Test1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myName = req.getParameter("myName");
		getServletContext().setAttribute("myName", myName);
//		req.getSession().setAttribute("myName", myName);
//		req.setAttribute("myName", myName);
		getServletContext().getRequestDispatcher("/test2").forward(req, resp);
	}
}
