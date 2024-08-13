package com.example.hotelmaster.repository;

import com.example.hotelmaster.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, String> {
}
