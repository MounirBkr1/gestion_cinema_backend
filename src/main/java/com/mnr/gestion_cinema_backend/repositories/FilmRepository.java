package com.mnr.gestion_cinema_backend.repositories;

import com.mnr.gestion_cinema_backend.entities.Cinema;
import com.mnr.gestion_cinema_backend.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

//avoir les films:http://localhost:8080/films
//avoir un film: http://localhost:8080/films/1
//avoir categorie d'un film: http://localhost:8080/films/1/categorie
//les films ds categorie 1: http://localhost:8080/categories/1/films


public interface FilmRepository extends JpaRepository<Film,Long> {
}
