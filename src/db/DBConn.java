package db;

import java.sql.*;

public class DBConn {
	static Connection conn = null;
	
	public static Connection getConn () {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/web?serverTimezone=GMT%2B8";
		String username = "root";
		String password = "1181207784";
		
	try {
		Class.forName(driverClassName);
		conn = DriverManager.getConnection(url, username, password);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return conn;
	
	}


}
