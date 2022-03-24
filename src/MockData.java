package src;

import java.util.ArrayList;

public class MockData {
    private static ArrayList<Item> items;
    private static ArrayList<Staff> staff;
    private static ArrayList<Customer> customers;
    private static ArrayList<Booking> bookings;
    private static ArrayList<Order> orders;

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static ArrayList<Staff> getStaff() {
        return staff;
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static ArrayList<Booking> getBookings() {
        return bookings;
    }

    public static ArrayList<Order> getOrders() {
        return orders;
    }
}
