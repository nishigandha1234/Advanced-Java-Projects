package com.jsp.storedProcedure;

import java.sql.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class StoredProcedureDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5433/personcrud";
		String user = "postgres";
		String password = "Admin@1234";
		
		try(Connection con = DriverManager.getConnection(url,user,password);
				Scanner sc = new Scanner(System.in);) {
			
			System.out.println("Con : "+con);
			
			CallableStatement scn = con.prepareCall("call emp_account_timesheet(?,?,?,?)");
			
			System.out.println("Enter id : ");
			int id = sc.nextInt();
			
			System.out.println("Enter name : ");
			String name = sc.next();
			
			System.out.println("Enter salary : ");
			double salary = sc.nextDouble();
			
			System.out.println("Designation : ");
			String designation = sc.next();
			
			scn.setInt(1, id);
			scn.setString(2, name);
			scn.setDouble(3, salary);
			scn.setString(4, designation);
			
			scn.execute();
			
			System.out.println("Stored Procedure executed successfully...!");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
