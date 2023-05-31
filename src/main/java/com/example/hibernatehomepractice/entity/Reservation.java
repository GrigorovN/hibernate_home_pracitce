package com.example.hibernatehomepractice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int stays;
    private Date dateIn;
    @ManyToOne
    private Room room;
    @ManyToOne
    private Hotel hotel;
    private double price;

}
