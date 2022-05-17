package com.jobiak.empapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobiak.empapi.model.Customer;
import com.jobiak.empapi.repository.MobileRepository;

@Service
public class MobileService {
	
	@Autowired
	MobileRepository repo;
	public Customer addCustomer(Customer customer) {
		Customer ref=repo.save(customer);
		
		
		return ref;
		
	}
	public Customer modifyCustomer(Customer customer) {
		
		
		
		return repo.save(customer);

}
public void removeProduct(Long customerid) {
		
		
		
		repo.deleteById(customerid);

}
public List<Customer> getAll() {
	
	return repo.findAll();
}
}
