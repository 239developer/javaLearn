package com.example.demo;

import java.sql.*;

public class DemoApplication {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			ResultSet q = conn.createStatement().executeQuery("SELECT version()");
			if(q.next()) {System.out.println(q.getString(1));}

			conn.close();
		}
		catch(Exception ex) {ex.printStackTrace();}
	}
}
