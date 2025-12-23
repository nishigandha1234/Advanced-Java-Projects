package jdbc_crud;

import java.io.IOException;

class Employee implements AutoCloseable{
	@Override
	public void close() throws IOException{
		System.out.println("CLosing Employee Resources...");
	}
}
public class TryWithResourceEx2 {

	public static void main(String[] args) {
		try(Employee e = new Employee();) {
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
