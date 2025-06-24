import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class con {

    // Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/+farmerdata";
    private static final String USER = "root";
    private static final String PASSWORD = "25Sripriya02@";

    // Method to establish the database connection
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create the connection to the database
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null,"Database Connection SuccessFull");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Database driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database!");
            e.printStackTrace();
        }
        return conn;
    }
}
