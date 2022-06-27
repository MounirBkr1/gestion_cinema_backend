package com.mnr.gestion_cinema_backend.repositories;

import com.mnr.gestion_cinema_backend.entities.Cinema;
import com.mnr.gestion_cinema_backend.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville,Long> {
}
