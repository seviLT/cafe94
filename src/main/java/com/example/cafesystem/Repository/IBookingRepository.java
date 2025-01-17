package com.example.cafesystem.Repository;

import com.example.cafesystem.Booking;
import com.example.cafesystem.ViewModels.CreateBooking;
import com.example.cafesystem.ViewModels.UpdateCreateBooking;

import java.util.UUID;

public abstract class IBookingRepository {
    public abstract UUID createBooking(CreateBooking booking);
    public abstract void updateBooking(UUID bookingId, UpdateCreateBooking updateCreateBooking);
    public abstract void deleteBooking(UUID bookingId);
    public abstract Booking getBookingId(UUID bookingId);
}
