package com.example.hotelmaster.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomTypeReponse {
    Long roomTypeId;
    String name;
    String description;
    Integer capacity;
    BigDecimal pricePerNight;
}
