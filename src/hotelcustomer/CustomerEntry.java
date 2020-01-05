package hotelcustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerEntry {
    public boolean isCreated = false;
    Scanner scanner = new Scanner(System.in);

    public void createNewCustomer(Connection connection, Customer customer) throws SQLException {
        String query = "INSERT INTO hotelcustomer VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, customer.getCustomerId());
        preparedStatement.setString(2, customer.getCustomerName());
        preparedStatement.setString(3, customer.getAddharNumber());
        preparedStatement.setInt(4, customer.getCustomerRoomNo());
        preparedStatement.setString(5, customer.getCustomerContact());
        preparedStatement.setString(6, customer.getCheckIn());
        preparedStatement.setString(7, customer.getCheckOut());
        preparedStatement.setDouble(8, customer.getAmount());
        isCreated = preparedStatement.executeUpdate() >= 1;
    }

    public void isCreationSuccessful() {
        if (isCreated) {
            System.out.println("CUSTOMER ENTRY DONE.THERE ARE THE KEYS");
        } else {
            System.out.println("CUSTOMER ENTRY NOT SUCCESSFULL!!!");
        }
    }

    public int getCustomerId() {
        return (int) (Math.random() * 1000000000);
    }

    public String getCustomerName() {
        System.out.println("enter the customer name");
        return scanner.nextLine().trim();
    }

    public String getAddharNumber() {
        System.out.println("enter the addhar number");
        return scanner.next();
    }

    public int getRoomNo() {
        System.out.println("enter the room number");
        return scanner.nextInt();
    }

    public String getCustomerContact() {
        System.out.println("enter the customer contact number");
        return scanner.next();
    }

    public String getCheckIn() {
        System.out.println("enter check in date");
        return scanner.next();
    }

    public String getCheckOut() {
        System.out.println("enter check out date");
        return scanner.next();
    }

    public double getBill() {
        System.out.println("enter bill");
        return scanner.nextDouble();
    }
}
