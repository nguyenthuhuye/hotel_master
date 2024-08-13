package com.example.hotelmaster.repository;

import com.example.hotelmaster.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
    @Query(value = "SELECT r.room_id, r.room_number, rt.name AS room_type " +
            "FROM Rooms r " +
            "JOIN RoomTypes rt ON r.room_type_id = rt.room_type_id " +
            "WHERE rt.name = :roomTypeName " +
            "AND r.status = 'Available' " +
            "AND r.room_id NOT IN ( " +
            "    SELECT DISTINCT b.room_id " +
            "    FROM Bookings b " +
            "    WHERE (b.check_in_date <= :checkOutDate AND b.check_out_date >= :checkInDate) " +
            "      AND b.status != 'Cancelled' " +
            ") " +
            "ORDER BY r.room_number", nativeQuery = true)
    List<Object[]> findAvailableRoomsByType(@Param("roomTypeName") String roomTypeName,
                                            @Param("checkInDate") LocalDate checkInDate,
                                            @Param("checkOutDate") LocalDate checkOutDate);

}
