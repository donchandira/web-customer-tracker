package com.chandira.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chandira.springdemo.dao.CustomerDAO;
import com.chandira.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject the customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model model)
	{
		
		// get the custoemrs from the dao
		List<Customer> customers = customerDAO.getCustomers();
		
		// add customers to the model
		model.addAttribute("customers", customers);
		
		return "list-customers";
	}

}
