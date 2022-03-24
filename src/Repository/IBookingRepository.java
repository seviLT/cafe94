package src.Repository;

import src.Booking;
import src.ViewModels.CreateBooking;
import src.ViewModels.UpdateCreateBooking;

import java.util.UUID;

public interface IBookingRepository {
    public UUID createBooking(CreateBooking booking);
    public void updateBooking(UUID bookingId, UpdateCreateBooking updateCreateBooking);
    public void deleteBooking(UUID bookingId);
    public Booking getBookingId(UUID bookingId);
}
