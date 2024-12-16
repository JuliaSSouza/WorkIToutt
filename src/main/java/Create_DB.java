package main.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class Create_DB{
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "password";

	public Connection conectaBD() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/";
			conn = DriverManager.getConnection(url, USER, PASS);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return conn;
	
	}}

