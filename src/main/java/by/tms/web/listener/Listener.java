package by.tms.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.concurrent.atomic.AtomicInteger;


@WebListener
public class Listener implements ServletContextListener, HttpSessionListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
//		sce.getServletContext().setAttribute("counter", new AtomicInteger(0));
		System.out.println("Context initialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context destroyed");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {

	}
}
