package com.chandira.springdemo.dao;

import java.util.List;

import com.chandira.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);
	
}
