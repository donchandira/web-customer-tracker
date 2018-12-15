package com.chandira.springdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chandira.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);
	
}
