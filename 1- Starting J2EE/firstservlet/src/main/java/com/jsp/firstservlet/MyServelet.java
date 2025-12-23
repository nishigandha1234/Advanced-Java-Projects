package com.jsp.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServelet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
		PrintWriter pw = res.getWriter();
		pw.write("<head>");
		pw.write("<body>");
		pw.write("<h1>"+name+"</h1>");
		pw.write("<h1>"+age+"</h1>");
		pw.write("</body>");
		pw.write("</head>");
		
	}
}