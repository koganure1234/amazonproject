package com.amazonproject.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconfig {

	private static Connection con=null;
	public static Connection getConnection() {
		if(con==null) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			System.out.println("create connection successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Issue present at the time of creating connection");
		}
		}
		return null;
			
	}
	
	public static void closeConnection() {
		if(con!=null) {
			DBconfig.closeConnection();
		}
	}
		public static void main(String[] args) {
			 getConnection();
		}

}