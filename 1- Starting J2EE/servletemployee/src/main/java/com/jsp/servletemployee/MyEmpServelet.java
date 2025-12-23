package com.jsp.servletemployee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyEmpServelet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String firstname = req.getParameter("FirstName");
        String lastname = req.getParameter("LastName");
        String location = req.getParameter("Location");
        String mob = req.getParameter("Mobile");
        String age = req.getParameter("Age");
        String gender = req.getParameter("Gender");
        String yop = req.getParameter("YOP");  
        String role = req.getParameter("Role");

        System.out.println("FirstName:" + firstname);
        System.out.println("LastName:" + lastname);
        System.out.println("Location:" + location);
        System.out.println("Mobile:" + mob);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("YOP:" + yop);
        System.out.println("R"
        		+ "ole:" + role);

//        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        pw.write("<html>");
        pw.write("<head><title>Employee Details</title></head>");
        pw.write("<body>");
        pw.write("<h1>Employee Details:</h1>");
        pw.write("<h2>FirstName: " + firstname + "</h2>");
        pw.write("<h2>LastName: " + lastname + "</h2>");
        pw.write("<h2>Location: " + location + "</h2>");
        pw.write("<h2>Mobile: " + mob + "</h2>");
        pw.write("<h2>Age: " + age + "</h2>");
        pw.write("<h2>Gender: " + gender + "</h2>");
        pw.write("<h2>YOP: " + yop + "</h2>");
        pw.write("<h2>Role: " + role + "</h2>");
        pw.write("</body>");
        pw.write("</html>");
    }
}
