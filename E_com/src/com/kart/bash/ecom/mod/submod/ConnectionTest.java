package com.kart.bash.ecom.mod.submod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	
	Connection connection = null;

	public Connection getConnectionDetails() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/diy_tools", "root", 			"Harsh@565859");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}
}
