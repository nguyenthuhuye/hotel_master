package com.example.hotelmaster.service;

import com.example.hotelmaster.dto.request.BookingRequest;
import com.example.hotelmaster.dto.request.RoomRequest;
import com.example.hotelmaster.entity.Booking;
import com.example.hotelmaster.entity.Room;
import com.example.hotelmaster.exception.AppException;
import com.example.hotelmaster.exception.ErrorCode;
import com.example.hotelmaster.mapper.BookingMapper;
import com.example.hotelmaster.repository.BookingRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class BookingService {
    BookingRepository bookingRepository;
    BookingMapper bookingMapper;


    public Booking createBooking(BookingRequest request){
//        if(bookingRepository.existsByUsername(request.getRoomNumber()))
//            throw new AppException(ErrorCode.EXISTED);
        Booking booking = bookingMapper.toBooking(request);
        return bookingRepository.save(booking);
    }

    public Booking updateBooking(String bookingId, BookingRequest request){
        Booking booking = bookingRepository.findById(bookingId).orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        bookingMapper.updateBooking(booking, request);

        return bookingRepository.save(booking);
    }
    public void deleteBooking (String bookingId){
        bookingRepository.deleteById(bookingId);
    }

    public Booking getBooking (String bookingId){
        return  bookingRepository.findById(bookingId)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
    }
}
