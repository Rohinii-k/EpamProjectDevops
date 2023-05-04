package com.jfsd.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jfsd.entity.User;
import com.jfsd.service.BookingService;
import com.jfsd.service.FlightService;
import com.jfsd.service.HotelService;
import com.jfsd.service.PlaceService;
import com.jfsd.service.TourPackageService;
import com.jfsd.service.UserService;

@Controller
public class HomeController {
	
	@Autowired UserService uservice;
	@Autowired BookingService bservice;
	@Autowired HttpSession session;
	@Autowired HotelService hservice;
	@Autowired FlightService fservice;
	@Autowired PlaceService pservice;
	@Autowired TourPackageService tservice;

	@GetMapping("/")
	public String homepage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String loginpage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String validate(String userid,String pwd,RedirectAttributes ra) {
		User user=uservice.ValidateLogin(userid, pwd);
		if(user==null) {
			ra.addFlashAttribute("error", "Invalid username or password");
			return "redirect:/login";
		}else {
			session.setAttribute("userid", user.getUserid());
			session.setAttribute("uname", user.getUname());
			session.setAttribute("role", user.getRole());
			return "redirect:/packages";			
		}
	}
	
	@GetMapping("/register")
	public String registerpage() {
		return "register";
	}
	
	@PostMapping("/register")
	public String saveuser(User user,RedirectAttributes ra) {
		ra.addFlashAttribute("msg", "User registered successfully");
		uservice.saveUser(user);
		return "redirect:/login";
	}
	
	@GetMapping("/hotels")
	public String hotels(Model model) {
		model.addAttribute("list", hservice.listall());
		return "hotels";
	}
	
	@GetMapping("/book")
	public String bookings(String tour,Model model,RedirectAttributes ra) {
		model.addAttribute("hotels", hservice.listall());
		model.addAttribute("flights", fservice.listall());
		model.addAttribute("tours", tservice.listall());
		if(session.getAttribute("userid") == null) {
			ra.addFlashAttribute("error", "Please login first for booking");
			return "redirect:/login";
		}
		return "bookings";
	}
	
	@GetMapping("/payment")
	public String payments(int bid) {
		return "payment";
	}
	
	
	@GetMapping("/places")
	public String places(Model model) {
		model.addAttribute("list", pservice.listAll());
		return "places";
	}
	
	
	@GetMapping("/packages")
	public String packages(Model model) {
		model.addAttribute("list", tservice.listall());
		return "packages";
	}
	
	@GetMapping("/flights")
	public String flights(Model model) {
		model.addAttribute("list", fservice.listall());
		return "flights";
	}
	
	@GetMapping("/logout")
	public String logout(){
		session.invalidate();
		return "redirect:/";
	}
	
	//Profile page
	@GetMapping("/profile")
	public String profile(Model model)
	{
		model.addAttribute("title", "Profile Page");
		return "profile";
	}
}
