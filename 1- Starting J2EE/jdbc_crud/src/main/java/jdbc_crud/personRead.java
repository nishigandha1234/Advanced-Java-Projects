package jdbc_crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class personRead {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			//establish connection
			String url = "jdbc:postgresql://localhost:5433/personcrud";
			String user = "postgres";
			String password = "Admin@1234";
			
			Connection c1 = DriverManager.getConnection(url, user, password);
			System.out.println("CONNECTION : " +c1);
			
			//CREATE STATEMENT
			Statement st = c1.createStatement();
			
			//Query
			String read = "SELECT * FROM PERSON";
			st.execute(read);
			
			ResultSet rs = st.getResultSet();
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				System.out.println("id : " +id+ "Name : "+name+ " Age : "+age);
				System.out.println();
			}
			c1.close();
		}
		
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
