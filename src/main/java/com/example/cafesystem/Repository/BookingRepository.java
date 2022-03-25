package com.example.cafesystem.Repository;
import com.example.cafesystem.*;
import com.example.cafesystem.ViewModels.CreateBooking;
import com.example.cafesystem.ViewModels.UpdateCreateBooking;

import java.util.ArrayList;
import java.util.UUID;

public class BookingRepository extends IBookingRepository{
    @Override
    public UUID createBooking(CreateBooking booking) {
        ArrayList<Booking> all = MockData.getBookings();
        UUID newId = UUID.randomUUID();
        all.add(new Booking(newId, booking.bookingDay, booking.bookingTime,
                booking.customerID, booking.numberOfGuest));
        return newId;
    }

    @Override
    public void updateBooking(UUID bookingId, UpdateCreateBooking updateCreateBooking) {
        ArrayList<Booking> all = MockData.getBookings();
        Booking booking =  getBookingId(bookingId);

        int index = all.indexOf(booking);

        booking.setBookingDay(updateCreateBooking.bDay);
        booking.setNumberOfGuest(updateCreateBooking.noGuests);
        booking.setBookingTime(updateCreateBooking.dTime);

        all.set(index, booking);

        return;
    }

    @Override
    public void deleteBooking(UUID bookingId) {
        ArrayList<Booking> all = MockData.getBookings();
        all.removeIf(x -> x.getId() == bookingId);

        return;

    }

    @Override
    public Booking getBookingId(UUID bookingId) {
        ArrayList<Booking> all = MockData.getBookings();

        return all.stream().filter(x -> x.getId() == bookingId).findAny().orElse(null);
    }
}
