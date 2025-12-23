package com.jsp.annotation;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet(urlPatterns = "go")
public class ServletDriver extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		HttpServletRequest hrp = (HttpServletRequest) req;
		String method = hrp.getMethod();
		
		if (method.equals("POST")) {
			System.out.println(method+"type of Request");
		}
		else if (method.equals("GET")) {
			System.out.println(method+"type of Request");
		}
	}

}
