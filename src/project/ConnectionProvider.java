package project;
import java.sql.*;

public class ConnectionProvider {
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://SAMUEL;Database=IdForm;");	
            return con;
		}catch(Exception e) {
			
			System.out.println(e);
			return null;
		}
		
	}
}
/* Connection con;
			PreparedStatement pst;
			Class.forName("com.mysql.jdbc.Driver");
		*/
