package jdbcdemo;
import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		try {
				Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila" , "root" , "siawo");
				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery("select * from actor");
				
				while(myRs.next()) {
					System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name") );
				}
		}
		
		catch(Exception exc){
			exc.printStackTrace();
		}

}
}
