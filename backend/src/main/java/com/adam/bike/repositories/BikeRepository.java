package com.adam.bike.repositories;

import com.adam.bike.models.Bike;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}