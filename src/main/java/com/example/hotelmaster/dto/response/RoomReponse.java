package com.example.hotelmaster.dto.response;

import com.example.hotelmaster.entity.Room;
import com.example.hotelmaster.entity.RoomType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomReponse {
//    RoomType roomType;
//    String roomNumber;
//    Room.RoomStatus status;

    String roomId;
    String roomNumber;
    String roomType;
}
