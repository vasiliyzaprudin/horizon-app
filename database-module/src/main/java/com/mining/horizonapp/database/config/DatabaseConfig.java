package com.mining.horizonapp.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private static final String URL = "jdbc:postgresql://localhost:5432/horizon";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Pfghelby";

    public static Connection getConnection() throws SQLException {
        System.out.println("Подключаюсь к: " + URL);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}