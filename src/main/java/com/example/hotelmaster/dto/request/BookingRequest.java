package com.example.hotelmaster.dto.request;

import com.example.hotelmaster.entity.Booking;
import com.example.hotelmaster.entity.Guest;
import com.example.hotelmaster.entity.Room;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingRequest {
    Guest guest;
    Room room;
    LocalDate checkInDate;
    LocalDate checkOutDate;
    BigDecimal totalPrice;
    Booking.BookingStatus status;

}
