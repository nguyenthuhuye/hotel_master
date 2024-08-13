package com.example.hotelmaster.service;

import com.example.hotelmaster.dto.request.BookingRequest;
import com.example.hotelmaster.dto.request.GuestRequest;
import com.example.hotelmaster.entity.Booking;
import com.example.hotelmaster.entity.Guest;
import com.example.hotelmaster.exception.AppException;
import com.example.hotelmaster.exception.ErrorCode;
import com.example.hotelmaster.mapper.GuestMapper;
import com.example.hotelmaster.repository.GuestRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class GuestService {
    GuestRepository guestRepository;
    GuestMapper guestMapper;

    public Guest createGuest (GuestRequest request){
//        if(bookingRepository.existsByUsername(request.getRoomNumber()))
//            throw new AppException(ErrorCode.EXISTED);
        Guest guest = guestMapper.toGuest(request);
        return guestRepository.save(guest);
    }

    public Guest updateGuest (String guestId, GuestRequest request){
        Guest guest = guestRepository.findById(guestId).orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        guestMapper.updateGuest(guest, request);

        return guestRepository.save(guest);
    }
    public void deleteGuest (String guestId){
        guestRepository.deleteById(guestId);
    }

    public Guest getGuest (String guestId){
        return  guestRepository.findById(guestId)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
    }
}
