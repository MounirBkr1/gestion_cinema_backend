package com.mnr.gestion_cinema_backend;

import com.mnr.gestion_cinema_backend.services.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionCinemaBackendApplication implements CommandLineRunner {

    @Autowired
    private ICinemaInitService cinemaInitService;

    public static void main(String[] args) {
        SpringApplication.run(GestionCinemaBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cinemaInitService.initVilles();
        cinemaInitService.initCinemas();
        cinemaInitService.initPlaces();
        cinemaInitService.initSeances();
        cinemaInitService.initSalles();
        cinemaInitService.initCategories();
        cinemaInitService.initCategories();
        cinemaInitService.initFilmes();
        cinemaInitService.initProjections();
        cinemaInitService.initTickets();
    }
}
