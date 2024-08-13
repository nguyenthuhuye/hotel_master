package com.example.hotelmaster.repository;

import com.example.hotelmaster.entity.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, String> {
    boolean existsByName(String name);
}
