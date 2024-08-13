package com.example.hotelmaster.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String roomId;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;

    private String roomNumber;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;

    @Column(name = "image_url")
    private String imageUrl;

    public enum RoomStatus {
        AVAILABLE, OCCUPIED, MAINTENANCE
    }
}
