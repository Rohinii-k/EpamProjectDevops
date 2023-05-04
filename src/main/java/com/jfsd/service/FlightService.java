package com.jfsd.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.entity.Flight;
import com.jfsd.repo.FlightRepository;


@Service
public class FlightService {

	@Autowired FlightRepository repo;
	
	public void saveFlight(Flight flight) {
		repo.save(flight);
	}
	
	public List<Flight> listall(){
		return repo.findAll();
	}
	
	public Flight findById(int id) {
		return   repo.getById(id);
	}
}
