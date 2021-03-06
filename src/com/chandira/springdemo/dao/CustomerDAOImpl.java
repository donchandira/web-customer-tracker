package com.chandira.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chandira.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		
		// execute query and get reuslt list
		return query.getResultList();
		
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.save(customer);
		
	}

}
