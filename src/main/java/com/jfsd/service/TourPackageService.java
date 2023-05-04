package com.jfsd.service;

import java.nio.file.Paths;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jfsd.entity.TourPackage;
import com.jfsd.repo.PackageRepository;



@Service
public class TourPackageService {

	@Autowired PackageRepository repo;
	@Autowired ServletContext ctx;
	
	public void savePakage(TourPackage pkg,MultipartFile photo) {
		try {
			photo.transferTo(Paths.get(ctx.getRealPath("/pics/"), photo.getOriginalFilename()));
		}catch(Exception ex) {
			System.err.println("Error "+ex.getMessage());
		}
		
		pkg.setPhoto("/pics/"+photo.getOriginalFilename());
		repo.save(pkg);
	}
	
	public List<TourPackage> listall(){
		return repo.findAll();
	}
	
	public TourPackage findById(int id) {
		return repo.getById(id);
	}
}
