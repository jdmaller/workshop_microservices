package com.workshop.rentalService.vo;

import com.workshop.rentalService.entity.Rental;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalMovieTemplate {

	private Rental rental;
	private Movie movie;
}
