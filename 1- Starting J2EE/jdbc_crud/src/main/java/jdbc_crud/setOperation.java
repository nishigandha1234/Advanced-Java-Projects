package jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class setOperation {

	public static void main(String[] args) {

		try {
			String url = "jdbc:postgresql://localhost:5433/personcrud?user=postgres&password=Admin@1234";
			Connection con = DriverManager.getConnection(url);
			System.out.println("Connection: "+con);
			
			String sql = "INSERT INTO PERSON VALUES(?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the No of rows");
			int count = sc.nextInt();
			for(int i=1;i<=count;i++)
			{
				System.out.println("Enter the id: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the name");
				String name = sc.nextLine();
				
				System.out.println("Enter the age");
				int age = sc.nextInt();
				
				st.setInt(1,id);
				st.setString(2, name);
				st.setInt(3, age);
				st.execute();
				System.out.println(i+"Data inserted");	
			}
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}