package com.jfsd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.jfsd.entity.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
