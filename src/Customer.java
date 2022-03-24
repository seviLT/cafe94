package src;

import java.util.ArrayList;
import java.util.UUID;

//customers can use the system
//to make bookings and view information about the menus etc.
public class Customer extends  Person {
    public Customer(UUID custId, String fName, String lName, String password, String address, String email) {
        super(fName,lName, password, address, email);
        setId(custId);
    }
}
