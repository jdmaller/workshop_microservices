package com.workshop.movieService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.movieService.entity.Movie;
import com.workshop.movieService.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	public Movie save(Movie entity) {
		return repository.save(entity);
	}
	
	public Movie get(Long id) {
		return repository.findById(id).get();
	}
}
