package hotelcustomer;

public class Customer {
    private int customerId;
    private String customerName;
    private int addharNumber;
    private int customerRoomNo;
    private long customerContact;
    private String checkIn;
    private String checkOut;
    private double amount;

    public Customer(int cid, String n, int an, int rn, long c, String cin, String cout, double amt) {
        customerId = cid;
        customerName = n;
        addharNumber = an;
        customerRoomNo = rn;
        customerContact = c;
        checkIn = cin;
        checkOut = cout;
        amount = amt;
    }

    @Override
    public String toString() {
        return "Name of the customer" + customerName +
                "CustomerID" + customerId +
                "Addhar Number" + addharNumber +
                "Customer room no" + customerRoomNo +
                "check out date" + checkOut +
                "amount to be paid" + amount;
    }

}
