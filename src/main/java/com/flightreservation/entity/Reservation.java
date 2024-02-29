package com.flightreservation.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long RId;
    private boolean checkedIn;
    private int NumberOfBags;

    @OneToOne
    private Passenger passenger;

    @OneToOne
    private Flight flight;
}
