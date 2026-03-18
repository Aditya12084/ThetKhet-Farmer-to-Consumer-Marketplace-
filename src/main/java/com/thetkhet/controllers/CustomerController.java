//package com.thetkhet.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.thetkhet.entities.Customer;
//import com.thetkhet.repos.CustomerRepositiory;
//import com.thetkhet.repos.FarmerRepository;
//
//@CrossOrigin("*")
//@RequestMapping("/api/")
//@RestController
//public class CustomerController {
//
//	@Autowired
//	private CustomerRepositiory repo;
//
//	@GetMapping("/allCustomers/")
//	public List<Customer> getProduct() {
//		return repo.findAll();
//	}
//
//	@PostMapping("/regFarmer")
//	public String addProduct(@RequestBody Customer customer) {
//		String res;
//		try {
//			repo.save(customer);
//			res = "Success";
//		} catch (Exception e) {
//			e.printStackTrace();
//			res = e.getMessage();
//		}
//		return res;
//	}
//
//	@PatchMapping("/farmer/updateUsername")
//	public String updateUsername(@RequestBody Customer customer) {
//		String res;
//		try {
//			repo.save(customer);
//			res = "Success";
//		} catch (Exception e) {
//			e.printStackTrace();
//			res = e.getMessage();
//		}
//		return res;
//
//	}
//
//	@PatchMapping("/farmer/updatePassword")
//	public String updatePassword(@RequestBody Customer customer) {
//		String res;
//		try {
//			repo.save(customer);
//			res = "Success";
//		} catch (Exception e) {
//			e.printStackTrace();
//			res = e.getMessage();
//		}
//		return res;
//	}
//
//}
