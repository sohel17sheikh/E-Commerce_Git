package com.kart.bash.ecom.mod.submod;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UserAuth_DB implements User_Product_DB {

	static Scanner in = new Scanner(System.in);
	ConnectionTest ct = new ConnectionTest();
	Statement ps;

	public static void main(String[] args) {
		UserAuth_DB obj = new UserAuth_DB();
		obj.createProductDatabase();
	}

	@Override
	public void userVerification() {
		System.out.println("Enter first name");
		String fname = in.next();
		System.out.println("Enter last name");
		String lname = in.next();
		System.out.println("Enter user name");
		String uname = in.next();
		System.out.println("set password ");
		String password = in.next();
		if ((uname == "harsh" && password == "11111") || (uname == "sohel" && password == "22222")
				|| (uname == "sushil" && password == "33333") || (uname == "bhushan" && password == "44444")) {
			System.out.println("Hello");
		}
	}

	@Override
	public void createProductDatabase() {
		Connection con = ct.getconnection();
		try {

//			String sql = "create table hardware (id int , description varchar (255), price varchar(255) , name varchar(255), quantity varchar(255))";
			String sql1 = "insert into  hardware  values (3 , 'value' , '80' , 'pneumatic' , '500' )";
//			String sql2 = "insert into  hardware  values (1 , 'metalic hammer' , '400' , 'hammer' , '500' )";
//			String sql3 = "insert into  hardware  values (1 , 'metalic hammer' , '400' , 'hammer' , '500' )";
//			String sql4 = "insert into  hardware  values (1 , 'metalic hammer' , '400' , 'hammer' , '500' )";
//			
//			
			ps = con.createStatement();
			ps.execute(sql1);
		//	ps.execute(sql);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
