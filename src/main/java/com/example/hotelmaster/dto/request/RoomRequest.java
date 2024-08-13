package com.example.hotelmaster.dto.request;

import com.example.hotelmaster.entity.Room;
import com.example.hotelmaster.entity.RoomType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomRequest {
    RoomType roomType;
    String roomNumber;
    Room.RoomStatus status;
    String imageUrl;
}
