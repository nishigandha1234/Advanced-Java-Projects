package jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		//establish connection 
		String url = "jdbc:postgresql://localhost:5433/personcrud";
		String user = "postgres";
		String password = "Admin@1234";
		
		try(Connection con = DriverManager.getConnection(url, user, password);
				Scanner sc = new Scanner(System.in);)
		{
			//Create Statement
			String sql = "INSERT INTO person VALUES(?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			//execute query
			System.out.println("Enter id : ");
			int id = sc.nextInt();
			System.out.println("Enter name : ");
			String name = sc.next();
			System.out.println("Enter Age : ");
			int age = sc.nextInt();
			
			st.setInt(1, id);
			st.setString(2, name);
			st.setInt(3, age);
			st.execute();
			
			System.out.println("Data Stored...");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
