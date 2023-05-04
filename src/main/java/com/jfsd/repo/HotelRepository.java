package com.jfsd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.jfsd.entity.Hotel;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
