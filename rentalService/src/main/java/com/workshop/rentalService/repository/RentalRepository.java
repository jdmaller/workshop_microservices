package com.workshop.rentalService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.rentalService.entity.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long>{

}
