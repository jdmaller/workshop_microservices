package com.workshop.rentalService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.rentalService.entity.Rental;
import com.workshop.rentalService.service.RentalService;
import com.workshop.rentalService.vo.RentalMovieTemplate;

@RestController
@RequestMapping("/rental")
public class RentalController {
	
	@Autowired
	private RentalService service;

	@PostMapping("/")
	public Rental save(@RequestBody Rental entity) {
		return service.save(entity);
	}
	
	@GetMapping("/{id}")
	public RentalMovieTemplate get(@PathVariable("id") Long id) {
		
		return service.get(id);
	}
}
