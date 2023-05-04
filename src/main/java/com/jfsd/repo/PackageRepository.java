package com.jfsd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.jfsd.entity.TourPackage;


@Repository
public interface PackageRepository extends JpaRepository<TourPackage, Integer> {

}
