package hotelcustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HotelCustomerConnection {
    private static final String database = "jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = "";
    public Connection connection = null;

    public Connection getConnection() {
        return connection;
    }

    public Connection attemptConnection() throws SQLException {          //to establish connection


        connection = DriverManager.getConnection(database, username, password);//establish connection
        return connection;    //return the status of connection
    }

    public Connection closeConnection() throws SQLException {     //to close the connection

        getConnection().close();  //attempt to close connection
        return connection;  //returning connection status
    }
}

