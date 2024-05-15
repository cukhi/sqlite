package org.example.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {
    public static void main(String[] args) {
        // Informacje o poĹÄczeniu z bazÄ danych
        String url = "jdbc:mysql://localhost:3306/nazwa_bazy";
        String username = "nazwa_uzytkownika";
        String password = "haslo";

        // Zapytanie SQL do wykonania
        String sql = "INSERT INTO tabela (kolumna1, kolumna2) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            // Ustawienie parametrĂłw zapytania
            statement.setString(1, "WartoĹÄ kolumny 1");
            statement.setString(2, "WartoĹÄ kolumny 2");

            // Wykonanie zapytania
            int rowsAffected = statement.executeUpdate();

            // Sprawdzenie, ile wierszy zostaĹo zmienionych
            System.out.println("Liczba zmienionych wierszy: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

