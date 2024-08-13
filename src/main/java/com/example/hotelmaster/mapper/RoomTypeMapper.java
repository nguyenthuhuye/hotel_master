package com.example.hotelmaster.mapper;

import com.example.hotelmaster.dto.request.RoomTypeRequest;
import com.example.hotelmaster.dto.request.UserCreationRequest;
import com.example.hotelmaster.dto.request.UserUpdateRequest;
import com.example.hotelmaster.dto.response.RoomTypeReponse;
import com.example.hotelmaster.dto.response.UserResponse;
import com.example.hotelmaster.entity.RoomType;
import com.example.hotelmaster.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RoomTypeMapper {
    RoomType toRoomType (RoomTypeRequest request);

    RoomTypeReponse toRoomTypeReponse(RoomType roomType);

    void updateRoomType(@MappingTarget RoomType roomType, RoomTypeRequest request);
}
