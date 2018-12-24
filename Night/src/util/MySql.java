package util;

import java.sql.Connection;
import java.sql.DriverManager;
public class MySql {		 
		 
	public Connection conect(){  
		Connection con=null;
		String url ="jdbc:mysql://localhost:8889/";
		String db="nightDuty";
		String driver="com.mysql.cj.jdbc.Driver";
		String user="root";
		String pass="root";
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url + db, user, pass);
			if (con == null) {
	            System.out.println("Connection cannot be established");
	        }
	        return con;
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	    return null;
	}
		 
		

	}


