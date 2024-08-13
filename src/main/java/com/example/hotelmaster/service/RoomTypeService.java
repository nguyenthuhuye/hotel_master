package com.example.hotelmaster.service;

import com.example.hotelmaster.dto.request.RoomTypeRequest;
import com.example.hotelmaster.entity.RoomType;
import com.example.hotelmaster.exception.AppException;
import com.example.hotelmaster.exception.ErrorCode;
import com.example.hotelmaster.mapper.RoomTypeMapper;
import com.example.hotelmaster.repository.RoomTypeRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class RoomTypeService {
    RoomTypeRepository roomTypeRepository;
    RoomTypeMapper roomTypeMapper;

    public RoomType createRoomType(RoomTypeRequest request){
        if(roomTypeRepository.existsByName(request.getName()))
            throw new AppException(ErrorCode.EXISTED);
        RoomType roomType = roomTypeMapper.toRoomType(request);
        return roomTypeRepository.save(roomType);
    }

    public RoomType updateRoomType(String roomTypeId, RoomTypeRequest request){
        RoomType roomType = roomTypeRepository.findById(roomTypeId).orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        roomTypeMapper.updateRoomType(roomType, request);

        return roomTypeRepository.save(roomType);
    }
    public void deleteRoomType (String roomTypeId){
        roomTypeRepository.deleteById(roomTypeId);
    }

    public RoomType getRoomType (String roomTypeId){
        return  roomTypeRepository.findById(roomTypeId)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
    }
}
