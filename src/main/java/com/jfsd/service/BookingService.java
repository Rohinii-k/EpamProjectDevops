package com.jfsd.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.entity.Booking;
import com.jfsd.entity.Payment;
import com.jfsd.entity.User;
import com.jfsd.repo.BookingRepository;
import com.jfsd.repo.PaymentRepository;



@Service
public class BookingService {
	
	@Autowired BookingRepository repo;
	@Autowired UserService uservice;
	@Autowired PaymentRepository prepo;
	
	public Booking saveBooking(Booking b) {
		b.setStatus("Booked");
		return repo.save(b);	
	}
	
	public List<Booking> getAllBookings(){ 
		return repo.findAll();
	}
	
	public List<Booking> getMyBookings(String userid){
		User user=uservice.findByUserId(userid);
		return repo.findByUser(user);
	}
	
	public Booking findById(int id) {
		return repo.getById(id);
	}
	
	public void savePayment(Payment pmt) {
		prepo.save(pmt);
	}
}
