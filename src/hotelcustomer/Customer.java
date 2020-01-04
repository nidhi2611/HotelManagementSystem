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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAddharNumber() {
        return addharNumber;
    }

    public void setAddharNumber(int addharNumber) {
        this.addharNumber = addharNumber;
    }

    public int getCustomerRoomNo() {
        return customerRoomNo;
    }

    public void setCustomerRoomNo(int customerRoomNo) {
        this.customerRoomNo = customerRoomNo;
    }

    public long getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(long customerContact) {
        this.customerContact = customerContact;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
