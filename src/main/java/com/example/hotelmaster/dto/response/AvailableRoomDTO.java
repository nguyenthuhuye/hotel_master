package com.example.hotelmaster.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AvailableRoomDTO {
//    RoomType roomType;
//    String roomNumber;
//    Room.RoomStatus status;

        String roomId;
        String roomNumber;
        String roomType;
}
