package com.adv.Connection;
import java.sql.*;  
public class Sample1
{  
	 public static void main(String args[])
	 {

	        String url = "jdbc:mysql://localhost:3306/dmantz";
	        String user = "root";
	        String password = "Ashwini@1432";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection(url, user, password);
	            System.out.println("Connection established");

	            Statement stmt = con.createStatement();
				int result=stmt.executeUpdate("delete from employee where EMPNO=7521");  
				System.out.println(result+" records affected");  
				con.close();  
	        } 
	        catch (Exception e) 
	        {
	            System.out.println(e);
	        }
	}
}  