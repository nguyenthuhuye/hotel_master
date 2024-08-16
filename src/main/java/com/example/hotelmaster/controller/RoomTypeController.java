//package com.example.hotelmaster.controller;
//
//import com.example.hotelmaster.dto.request.ApiResponse;
//import com.example.hotelmaster.dto.request.RoomTypeRequest;
//import com.example.hotelmaster.dto.request.UserUpdateRequest;
//import com.example.hotelmaster.dto.response.RoomTypeReponse;
//import com.example.hotelmaster.dto.response.UserResponse;
//import com.example.hotelmaster.service.RoomTypeService;
//import jakarta.validation.Valid;
//import lombok.AccessLevel;
//import lombok.RequiredArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/roomType")
//@RequiredArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//@Slf4j
//public class RoomTypeController {
//    RoomTypeService roomTypeService;
//    @PostMapping
//    ApiResponse<RoomTypeReponse> createRoomType(@RequestBody @Valid RoomTypeRequest request) {
//        ApiResponse<RoomTypeReponse> apiResponse = new ApiResponse<>();
//        apiResponse.setResult(roomTypeService.createRoomType(request));
//        return apiResponse;
//    }
//
////    @GetMapping("/{roomTypeId}")
////    ApiResponse<RoomTypeReponse> getRoomType(@PathVariable("roomTypeId") String roomTypeId) {
////        return ApiResponse.<UserResponse>builder()
////                .result(roomTypeService.getRoomType(roomTypeId))
////                .build();
////    }
////
////
////    @DeleteMapping("/{userId}")
////    ApiResponse<String> deleteUser(@PathVariable String userId) {
////        userService.deleteUser(userId);
////        return ApiResponse.<String>builder().result("User has been deleted").build();
////    }
////
////    @PutMapping("/{userId}")
////    ApiResponse<RoomTypeReponse> updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request) {
////        return ApiResponse.<UserResponse>builder()
////                .result(userService.updateUser(userId, request))
////                .build();
////    }
//
//}
