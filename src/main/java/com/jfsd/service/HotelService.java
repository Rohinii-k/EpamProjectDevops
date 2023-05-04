package com.jfsd.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.entity.Hotel;
import com.jfsd.repo.HotelRepository;


@Service
public class HotelService {

	@Autowired HotelRepository repo;
	
	public void saveHotel(Hotel hotel) {
		repo.save(hotel);
	}
	
	public List<Hotel> listall(){
		return repo.findAll();
	}
	
	public Hotel findById(int id) {
		return repo.getById(id);
	}
}
