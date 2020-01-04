package hotelcustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HotelCustomerConnection {
    public String database = "jdbc:mysql://localhost:3306";
    public String username = "root";
    public String password = "";
    public Connection connection = null;

    public Connection getConnection() {
        return connection;
    }

    public boolean attemptConnection() {
        boolean isConnected = false;
        try {
            connection = DriverManager.getConnection(database, username, password);
            if (connection != null)
                isConnected = true;
        } catch (SQLException e) {
            System.out.println("SQL Exception occured..");
        }
        return isConnected;
    }
}
