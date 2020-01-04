package hotelcustomer;

public class Customer {
    private int customerId;
    private String customerName;
    private int addharNumber;
    private int customerRoomNo;
    private long customerContact;
    private String checkIn;
    private String checkOut;

    public Customer(int cid, String n, int an, int rn, long c, String cin, String cout) {
        customerId = cid;
        customerName = n;
        addharNumber = an;
        customerRoomNo = rn;
        customerContact = c;
        checkIn = cin;
        checkOut = cout;
    }

}
