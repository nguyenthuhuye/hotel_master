//package com.example.hotelmaster.service;
//
//import com.example.hotelmaster.dto.request.RoomRequest;
//import com.example.hotelmaster.dto.request.RoomTypeRequest;
//import com.example.hotelmaster.dto.response.AvailableRoomDTO;
//import com.example.hotelmaster.dto.response.RoomReponse;
//import com.example.hotelmaster.entity.Room;
//import com.example.hotelmaster.entity.RoomType;
//import com.example.hotelmaster.exception.AppException;
//import com.example.hotelmaster.exception.ErrorCode;
//import com.example.hotelmaster.mapper.RoomMapper;
//import com.example.hotelmaster.repository.RoomRepository;
//import lombok.AccessLevel;
//import lombok.RequiredArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//@Slf4j
//public class RoomService {
//    RoomRepository roomRepository;
//    RoomMapper roomMapper;
//
////    public Room createRoom(RoomRequest request){
////        if(roomRepository.existsByRoomNumber(request.getRoomNumber()))
////            throw new AppException(ErrorCode.EXISTED);
////        Room room = roomMapper.toRoom(request);
////        return roomRepository.save(room);
////    }
////
////    public Room updateRoom(String roomId, RoomRequest request){
////        Room room = roomRepository.findById(roomId).orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
////        roomMapper.updateRoom(room, request);
////
////        return roomRepository.save(room);
////    }
////    public void deleteRoom (String roomId){
////        roomRepository.deleteById(roomId);
////    }
////
////    public Room getRoom (String roomId){
////        return  roomRepository.findById(roomId)
////                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
////    }
//
//    public List<AvailableRoomDTO> findAvailableRooms(String roomType, LocalDate checkInDate, LocalDate checkOutDate) {
//        List<Object[]> results = roomRepository.findAvailableRoomsByType(roomType, checkInDate, checkOutDate);
//
//        return results.stream()
//                .map(result -> new AvailableRoomDTO(
//                        ((String) result[0]),  // room_id
//                        (String) result[1],                // room_number
//                        (String) result[2]                // room_type
////                        (String) result[3]                 // hotel_name
//                ))
//                .collect(Collectors.toList());
//    }
//}
