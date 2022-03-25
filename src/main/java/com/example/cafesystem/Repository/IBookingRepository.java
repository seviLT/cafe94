package com.example.cafesystem.Repository;

import com.example.cafesystem.Booking;
import com.example.cafesystem.ViewModels.CreateBooking;
import com.example.cafesystem.ViewModels.UpdateCreateBooking;

import java.util.UUID;

public interface IBookingRepository {
    public UUID createBooking(CreateBooking booking);
    public void updateBooking(UUID bookingId, UpdateCreateBooking updateCreateBooking);
    public void deleteBooking(UUID bookingId);
    public Booking getBookingId(UUID bookingId);
}
