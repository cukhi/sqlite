package org.example.sqlite;

import java.sql.*;

public class db {
    public static void main() {
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
                ResultSet resultSet = statement.executeQuery("SELECT * FROM pracownicy");
                while(resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String surname = resultSet.getString("surname");
                    String position = resultSet.getString("position");

                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Surname: " + surname);
                    System.out.println("Position: " + position);
                    System.out.println("---------");
                }




            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
                System.out.println("SQLState: " + e.getSQLState());
                System.out.println("VendorError: " + e.getErrorCode());
            }

                }
            }








