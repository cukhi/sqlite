package org.example.sqlite;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        db.main();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer opcji");

        int opcja = scanner.nextInt();

        switch (opcja){
            case 1:
                AddTable.main("nowa");
            case 2:
                InsertIntoTable.main("nowa","kruk","szymon");

        }

        stage.setTitle("Hello!");

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);

        pane.setPadding(new Insets(25,25,25,25));


        Scene scene = new Scene(pane, 320, 240);
        stage.setScene(scene);
        stage.show();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/4dt5_abd_firma";
        String username = "root";
        String password = "Student123!";


    }




    public static void main(String[] args) {
        launch();
    }
}