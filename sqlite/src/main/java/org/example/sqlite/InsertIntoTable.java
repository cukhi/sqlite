package org.example.sqlite;

import java.sql.*;

public class InsertIntoTable {
    public static void main(String nazwa,String col,String val) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/4dt5_abd_firma";
        String username = "root";
        String password = "Student123!";
        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement();



            ResultSet resultSet = statement.executeQuery("INSERT INTO  " + nazwa + '(' +col+')'+ "VALUES" + '(' + val + ')');





        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }

    }
}








