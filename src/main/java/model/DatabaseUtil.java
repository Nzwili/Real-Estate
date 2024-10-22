package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/user_db"; // Update to your database name
    private static final String USERNAME = "vic"; // Your MySQL username
    private static final String PASSWORD = "password"; // Your MySQL password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
