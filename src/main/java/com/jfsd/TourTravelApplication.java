package com.jfsd;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.jfsd.entity.User;
import com.jfsd.service.UserService;

@SpringBootApplication
@EnableJpaAuditing
public class TourTravelApplication {

	private static final Logger log = LoggerFactory.getLogger(TourTravelApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TourTravelApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserService srv) {
	    return (args) -> {
	    	if(srv.getAllUsers().size()==0) {
	    		User user=new User();
	    		user.setUserid("admin");
	    		user.setPwd("admin123");
	    		user.setRole("Admin");
	    		user.setGender("Male");
	    		user.setAddress("Noida");
	    		user.setPhone("9811763737");
	    		user.setUname("Administrator");
	    		srv.saveUser(user);
	    		log.info("Admin user created successfully");
	    	}
	    };
	}

}
