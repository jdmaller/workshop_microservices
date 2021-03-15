package com.workshop.rentalService.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_rental")
	private Long id;
	private Date rentalDate;
	private Long movieId;
	private Long clientId;
}
