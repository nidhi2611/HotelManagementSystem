package hotelcustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerEntry {
    public boolean isCreated = false;
    Scanner scanner = new Scanner(System.in);

    public void createNewCustomer(Connection connection, Customer customer) throws SQLException {
        String query = "INSERT INTO hotelcustomer(CustomerId,CustomerName,AddharNumber,CustomerRoomNo,CustomerContact,CheckIn,CheckOut,Bill) VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, customer.getCustomerId());
        preparedStatement.setString(2, customer.getCustomerName());
        preparedStatement.setInt(3, customer.getAddharNumber());
        preparedStatement.setInt(4, customer.getCustomerRoomNo());
        preparedStatement.setLong(5, customer.getCustomerContact());
        preparedStatement.setString(6, customer.getCheckIn());
        preparedStatement.setString(7, customer.getCheckOut());
        preparedStatement.setDouble(8, customer.getAmount());
        isCreated = preparedStatement.executeUpdate() >= 1;
    }
}
