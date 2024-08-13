package com.example.hotelmaster.dto.response;

import com.example.hotelmaster.entity.Booking;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GuestReponse {
    String firstName;
    String lastName;
    String email;
    String phone;
    String address;
    List<Booking> bookings;
}
