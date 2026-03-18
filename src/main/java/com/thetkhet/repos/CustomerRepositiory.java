package com.thetkhet.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.thetkhet.entities.Customer;


@Repository
public interface CustomerRepositiory extends JpaRepository <Customer,Long> {
    Customer findByUsername(String username);
}
