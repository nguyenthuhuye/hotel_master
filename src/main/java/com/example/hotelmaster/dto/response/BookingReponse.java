package com.example.hotelmaster.dto.response;

import com.example.hotelmaster.entity.Booking;
import com.example.hotelmaster.entity.Guest;
import com.example.hotelmaster.entity.Room;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingReponse {
    Guest guest;
    Room room;
    LocalDate checkInDate;
    LocalDate checkOutDate;
    BigDecimal totalPrice;
    Booking.BookingStatus status;

}
