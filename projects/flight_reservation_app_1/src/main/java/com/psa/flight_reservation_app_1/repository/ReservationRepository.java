package com.psa.flight_reservation_app_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.flight_reservation_app_1.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
