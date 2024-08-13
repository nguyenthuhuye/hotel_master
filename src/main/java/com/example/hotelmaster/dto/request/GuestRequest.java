package com.example.hotelmaster.dto.request;

import com.example.hotelmaster.entity.Booking;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GuestRequest {
    String firstName;
    String lastName;
    String email;
    String phone;
    String address;
    List<Booking> bookings;
}
