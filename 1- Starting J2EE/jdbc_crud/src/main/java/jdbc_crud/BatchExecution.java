package jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class BatchExecution {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5433/personcrud";
		String user = "postgres";
		String password = "Admin@1234";
		
		try(Connection c1 = DriverManager.getConnection(url,user, password);)
		{
			System.out.println("Con : " + c1);
			
			//create statement
			Statement st = c1.createStatement();
			
			String sqlInsert = "INSERT INTO person VALUES(1001,'Pankaj', 23)";
			st.addBatch(sqlInsert);
			
			String sqlInsert1 = "INSERT INTO person VALUES(1002, 'NISHIGANDHA', 22)";
			st.addBatch(sqlInsert1);
			
			String sqlInsert2 = "INSERT INTO person VALUES(1003, 'RONAK', 24)";
			st.addBatch(sqlInsert2);
			
//			String sqlUpdate = "UPDATE FROM person where id=101";
//			st.addBatch(sqlUpdate);
			
			String sqlDelete = "DELETE FROM person WHERE id=103";
			st.addBatch(sqlDelete);
			
			//execute query
			st.executeBatch();
			
			System.out.println("Batch Execution Done...");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
