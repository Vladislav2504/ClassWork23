package by.tms.web.servlet;

import by.tms.entity.Operation;
import by.tms.service.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


@WebServlet(value = "/calculator", loadOnStartup = 1, name = "CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
//	private AtomicInteger counter = new AtomicInteger(0);
//	private Map<String, String> map = new ConcurrentHashMap<>();

	private CalculatorService calculatorService = new CalculatorService();

	//Application Scope(Servlet context)
	//Session Scope
	//Request Scope
	//Page Scope

	@Override
	public void init() throws ServletException {
		System.out.println("Init");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service");
//		counter.incrementAndGet();
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Destroy");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Operation operation = new Operation();
		operation.setNum1(Double.parseDouble(req.getParameter("num1")));
		operation.setNum2(Double.parseDouble(req.getParameter("num2")));
		operation.setOperation(req.getParameter("operation"));
		operation = calculatorService.calculate(operation);
		resp.getWriter().write("result: " + operation);
	}
}
