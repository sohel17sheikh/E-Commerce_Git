package com.kart.bash.ecom.mod.submod;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionTest {
	//Connection con ;
	public  Connection getconnection() {
		Connection	con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dyi_tools", 			"root","Harsh@565859");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	
	}
}









//try {
//System.out.println("hello");
//Class.forName("com.mysql.cj.jdbc.Driver");
//Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/diy_tools", "root", 			"Harsh@565859");
//}catch (NullPointerException e) {
//e.printStackTrace();
//}
//catch (Exception e) {
//e.printStackTrace();
//}
//
//return con;