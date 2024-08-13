package com.example.hotelmaster.controller;

import com.example.hotelmaster.dto.response.AvailableRoomDTO;
import com.example.hotelmaster.service.RoomService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/room")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class RoomController {
    RoomService roomService;

    @GetMapping("/available")
    public ResponseEntity<List<AvailableRoomDTO>> getAvailableRooms(
            @RequestParam String roomType,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkInDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkOutDate) {

        List<AvailableRoomDTO> availableRooms = roomService.findAvailableRooms(roomType, checkInDate, checkOutDate);
        return ResponseEntity.ok(availableRooms);
    }
}
