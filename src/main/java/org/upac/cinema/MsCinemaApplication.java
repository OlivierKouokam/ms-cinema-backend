package org.upac.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.upac.cinema.service.ICinemaInitService;

@SpringBootApplication
public class MsCinemaApplication implements CommandLineRunner{

	@Autowired
	private ICinemaInitService cinemaInitService;
	
	public static void main(String[] args) {
		SpringApplication.run(MsCinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cinemaInitService.initVilles();
		cinemaInitService.initCinemas();
		cinemaInitService.initSalles();
		cinemaInitService.initPlaces();
		cinemaInitService.initSeances();
		cinemaInitService.initCategories();
		cinemaInitService.initFilms();
		cinemaInitService.initProjectionFilms();
		cinemaInitService.initTickets();
	}

}
