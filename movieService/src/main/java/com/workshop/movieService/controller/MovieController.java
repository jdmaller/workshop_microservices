package com.workshop.movieService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.movieService.entity.Movie;
import com.workshop.movieService.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@PostMapping("/")
	public Movie save(@RequestBody Movie entity) {
		
		return service.save(entity);
	}
	
	@GetMapping("/{id}")
	public Movie get(@PathVariable("id") Long id) {
		
		return service.get(id);
	}
}
