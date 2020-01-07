package hotelcustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerView {
    public ResultSet getAllEnteriesFromCustomer(Connection connection) throws SQLException {
        String insertQuery = "SELECT * FROM hotelcustomer";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        return preparedStatement.executeQuery();
    }

    public void printCurrentCustomerTable(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            int cid = resultSet.getInt("customerId");
            String name = resultSet.getString("customerName");
            String an = resultSet.getString("adhaarNumber");
            int rn = resultSet.getInt("customerRoomNo");
            String cc = resultSet.getString("customerContact");
            String ci = resultSet.getString("checkIn");
            String co = resultSet.getString("checkOut");
            double bill = resultSet.getDouble("bill");
            Customer customer = new Customer(cid, name, an, rn, cc, ci, co, bill);
            System.out.println(customer.toString());
        }
    }

    public ResultSet searchForCustomer(Connection connection) throws SQLException {
        String query = "select * from hotelcustomer where customerRoomNo = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the room number of the customer to be searched");
        preparedStatement.setInt(1, sc.nextInt());
        return preparedStatement.executeQuery();
    }
}
