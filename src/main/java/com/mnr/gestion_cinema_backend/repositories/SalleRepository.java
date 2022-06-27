package com.mnr.gestion_cinema_backend.repositories;

import com.mnr.gestion_cinema_backend.entities.Cinema;
import com.mnr.gestion_cinema_backend.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle,Long> {
}
