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

    public boolean attemptConnection() {          //to establish connection
        boolean isConnected = false;              // variable for status of connection
        try {
            connection = DriverManager.getConnection(database, username, password);//establish connection
            if (connection != null)
                isConnected = true;      // if connection is established change status to true
        } catch (SQLException e) {
            System.out.println("SQL Exception occured.."); //if not give error message
        }
        return isConnected;    //return the status of connection
    }

    public boolean closeConnection() {     //to close the connection
        boolean isCloseConnection = false;   // status of connection closing
        if (getConnection() != null) {
            try {
                getConnection().close();  //attempt to close connection
                isCloseConnection = true;
            } catch (SQLException e) {
                System.out.println("SQL EXCEPTION OCCURED...");
            }
        }
        return isCloseConnection;  //returning connection status
    }
}

