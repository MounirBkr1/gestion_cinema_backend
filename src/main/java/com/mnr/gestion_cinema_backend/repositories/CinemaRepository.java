package com.mnr.gestion_cinema_backend.repositories;

import com.mnr.gestion_cinema_backend.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
