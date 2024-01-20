package com.adv.Connection;
import java.sql.*;
public class sample 
{
	  public static void main(String args[]){

        String url = "jdbc:mysql://localhost:3306/dmantz";
        String user = "root";
        String password = "Ashwini@1432";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()==true) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

 }