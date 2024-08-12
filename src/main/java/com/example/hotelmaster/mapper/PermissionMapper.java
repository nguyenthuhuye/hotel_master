package com.example.hotelmaster.mapper;

import com.example.hotelmaster.dto.request.PermissionRequest;
import com.example.hotelmaster.dto.response.PermissionResponse;
import com.example.hotelmaster.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
