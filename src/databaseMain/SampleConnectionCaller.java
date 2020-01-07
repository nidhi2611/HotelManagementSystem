package databaseMain;

import hotelcustomer.Customer;
import hotelcustomer.CustomerEntry;
import hotelcustomer.CustomerView;
import hotelcustomer.HotelCustomerConnection;

import java.sql.SQLException;
import java.util.Scanner;

public class SampleConnectionCaller {
    public static void main(String args[]) throws SQLException {
        HotelCustomerConnection hotelCustomerConnection = new HotelCustomerConnection();
        if (hotelCustomerConnection.attemptConnection() != null) {
            System.out.println("WELCOME TO HOTEL MANAGEMENT SYSTEM");
        } else
            System.out.println("CONNECTION TO DATABASE FAILED AT STEP 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for new customer entry");
        System.out.println("Enter 2 for viewing the whole customer table");
        int choiceOfOperation = sc.nextInt();
        switch (choiceOfOperation) {
            case 1:
                CustomerEntry customerEntry = new CustomerEntry();
                int customerId = customerEntry.getCustomerId();
                String customerName = customerEntry.getCustomerName();
                String addharNumber = customerEntry.getAddharNumber();
                String customerContact = customerEntry.getCustomerContact();
                int roomNo = customerEntry.getRoomNo();
                String checkIn = customerEntry.getCheckIn();
                String checkOut = customerEntry.getCheckOut();
                double bill = customerEntry.getBill();
                Customer customer = new Customer(customerId, customerName, addharNumber, roomNo, customerContact, checkIn, checkOut, bill);
                customerEntry.createNewCustomer(hotelCustomerConnection.getConnection(), customer);
                customerEntry.isCreationSuccessful();

                break;
            case 2:
                CustomerView customerView = new CustomerView();
                customerView.printCurrentCustomerTable(customerView.getAllEnteriesFromCustomer(hotelCustomerConnection.getConnection()));
            default:
                throw new IllegalStateException("Unexpected value: " + choiceOfOperation);
        }
    }
}
