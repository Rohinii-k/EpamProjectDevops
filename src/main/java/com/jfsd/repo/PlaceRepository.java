package com.jfsd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.jfsd.entity.Place;


@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {

}
