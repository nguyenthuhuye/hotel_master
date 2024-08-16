package com.example.hotelmaster.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
//    @Column(name = "username", unique = true, columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_ci")
    @Column(nullable = false)
    String firstName;
    @Column(nullable = false)
    String lastName;
    String email;
    String phone;
    String password;
    String username;
    Role role;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

    public enum Role {
        MANA, ADMIN, USER
    }
}
