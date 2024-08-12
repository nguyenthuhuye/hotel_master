package com.example.hotelmaster.mapper;

import com.example.hotelmaster.dto.request.RoleRequest;
import com.example.hotelmaster.dto.response.RoleResponse;
import com.example.hotelmaster.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
