package com.example.hibernatehomepractice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private ViewType view;
    private String floor;
    private  int beds;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    @ManyToOne
    private Hotel hotel;
    @OneToMany(mappedBy = "room",fetch = FetchType.LAZY)
    private Set<Reservation> reservations;



}
