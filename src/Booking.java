package src;//import java.time;

import src.ViewModels.CreateBooking;

import java.util.UUID;

public class Booking extends BaseEntity
{
    private String bookingDay;
    private int bookingTime;
    private int customerID;
    private int numberOfGuest;

    public Booking(UUID bookingId, String bookingDay, int bookingTime, int customerID, int numberOfGuest) {
        setId(bookingId);
        this.bookingDay = bookingDay;
        this.bookingTime = bookingTime;
        this.customerID = customerID;
        this.numberOfGuest = numberOfGuest;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    public int getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(int bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }
}
