package com.mnr.gestion_cinema_backend.repositories;

import com.mnr.gestion_cinema_backend.entities.Cinema;
import com.mnr.gestion_cinema_backend.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place,Long> {
}
