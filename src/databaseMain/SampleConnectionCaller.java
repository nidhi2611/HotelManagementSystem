package databaseMain;
import hotelcustomer.HotelCustomerConnection;

import java.sql.SQLException;

public class SampleConnectionCaller {
    public static void main(String args[]) throws SQLException {
        HotelCustomerConnection hotelCustomerConnection = new HotelCustomerConnection();
        if (hotelCustomerConnection.attemptConnection() != null) {
            System.out.println("WELCOME TO HOTEL MANAGEMENT SYSTEM");
        } else
            System.out.println("CONNECTION TO DATABASE FAILED AT STEP 1");
    }
}
