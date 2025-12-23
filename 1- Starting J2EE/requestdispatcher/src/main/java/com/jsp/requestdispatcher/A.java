package com.jsp.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/a")
public class A extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("b");
		PrintWriter pw = resp.getWriter();
	
		pw.write("<head>");
		pw.write("<body>");
		pw.write("<h1>Request reached to Servlet Class A</h1>");
		pw.write("</body>");
		pw.write("</head>");
		//rd.forward(req, resp);
		rd.include(req, resp);
	}


}
