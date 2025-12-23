package jdbc_crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Person {
	public static void main(String[] args)
	{
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5433/personcrud";
			String user = "postgres";
			String password = "Admin@1234";
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection :"+con);
			Statement st = con.createStatement();
			
			String sql = "Update person SET age = 27 where id = 102" ;
			int rows = st.executeUpdate(sql);

            System.out.println("Rows updated: " + rows);
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}