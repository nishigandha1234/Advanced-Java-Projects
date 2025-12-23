package jdbc_crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class personInsert {
	public static void main(String[] args)
	{
		try {
			Class.forName("org.postgresql.Driver");
			//establish connection
			String url = "jdbc:postgresql://localhost:5433/personcrud";
			String user = "postgres";
			String password = "Admin@1234";
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection :"+con);
			
			//create statement
			Statement st = con.createStatement();
			
			//execute query
			//String update = "Update person SET age = 23 where id = 102" ;
			String insert = "INSERT INTO PERSON VALUES (105, 'NISHI', 22)";
			String insert1 = "INSERT INTO PERSON VALUES (104, 'Yash', 21)";
			//String delete = "DELETE FROM PERSON WHERE NAME = 'NISHI' ";
			
			st.execute(insert);
			st.execute(insert1);

			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}