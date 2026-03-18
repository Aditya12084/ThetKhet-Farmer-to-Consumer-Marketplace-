package com.thetkhet.auth;

import org.apache.el.stream.Optional;

import com.thetkhet.entities.Customer;

public class AuthResponse {
    private Customer customer;
    private String token;

    // Constructor
    public AuthResponse(Customer customer, String token) {
        this.customer = customer;
        this.token = token;
    }

    
	// Getters and Setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer.setEmail(token);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
