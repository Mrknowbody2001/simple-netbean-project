package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    public static Connection connect() {
        Connection conn = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/estimates", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Print the stack trace for debugging
        } catch (SQLException e) {
            e.printStackTrace(); // Print the stack trace for debugging
        }
        return conn;
    }
}