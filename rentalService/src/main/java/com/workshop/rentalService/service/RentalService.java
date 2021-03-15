package com.workshop.rentalService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.workshop.rentalService.entity.Rental;
import com.workshop.rentalService.repository.RentalRepository;
import com.workshop.rentalService.vo.Movie;
import com.workshop.rentalService.vo.RentalMovieTemplate;

@Service
public class RentalService {

	@Autowired
	RentalRepository repository;
	@Autowired
	RestTemplate restTemplate;
	
	public Rental save(Rental entity) {
		return repository.save(entity);
	}
	
	public RentalMovieTemplate get(Long rentalId) {
		Rental rent= repository.findById(rentalId).get();
		Movie movie=restTemplate.getForObject("http://localhost:8088/movies/"+rent.getMovieId(), Movie.class);
		return new RentalMovieTemplate(rent, movie);
		
	}
}
