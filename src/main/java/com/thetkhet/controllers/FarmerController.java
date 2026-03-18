package com.thetkhet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thetkhet.entities.Customer;
import com.thetkhet.entities.Farmer;
import com.thetkhet.repos.FarmerRepository;

@CrossOrigin("*")
@RestController
public class FarmerController {

	@Autowired
	private FarmerRepository repo;

	@GetMapping("/allProducts/")
	public List<Farmer> getProduct() {
		return repo.findAll();
	}

	@PostMapping("/regFarmer")
	public String addProduct(@RequestBody Farmer farmer) { 
		String res;
		try {
			
			System.out.println("Hello");
			repo.save(farmer);
			res = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			res = e.getMessage();
		}
		return res;
	}

	@PatchMapping("/farmer/updateUsername")
	public String updateUsername(@RequestBody Farmer farmer) {
		String res;
		try {
			repo.save(farmer);
			res = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			res = e.getMessage();
		}
		return res;

	}

	@PatchMapping("/farmer/updatePassword")
	public String updatePassword(@RequestBody Farmer farmer) {
		String res;
		try {
			repo.save(farmer);
			res = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			res = e.getMessage();
		}
		return res;
	}

}
