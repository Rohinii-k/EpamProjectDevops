package com.jfsd.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jfsd.entity.Booking;
import com.jfsd.entity.User;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	List<Booking> findByUser(User user);
}
