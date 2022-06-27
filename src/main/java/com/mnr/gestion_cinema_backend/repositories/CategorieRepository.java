package com.mnr.gestion_cinema_backend.repositories;

import com.mnr.gestion_cinema_backend.entities.Categorie;
import com.mnr.gestion_cinema_backend.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

//pour avoir categories:http://localhost:8080/categories
//consulter 1ere categorie: http://localhost:8080/categories/1
//pagination 2 element par page: http://localhost:8080/categories?page=0&size=2
//trier par name ascendant:http://localhost:8080/categories?page=0&size=3&sort=name,asc
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
