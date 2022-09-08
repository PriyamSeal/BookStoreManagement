package com.Capgemini.BookstoreManagement.Service;

import java.util.List;
import java.util.Optional;

import com.Capgemini.BookstoreManagement.Entity.Book;
import com.Capgemini.BookstoreManagement.Entity.Customer;
import com.Capgemini.BookstoreManagement.Repository.ICustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepository customerRepository;
	
	@Override
	public Customer createCustomer(Customer c) {
		
		
		customerRepository.save(c);
		return c;
		
	}

	@Override
	public List<Customer> listCustomers() {
		
		
		return customerRepository.findAll();
		
	}

	@Override
	public Customer deleteCustomer(int customer) {
		
		Optional<Customer> optional = customerRepository.findById(customer);
		Customer existingCustomer =((Optional<Customer>) optional).get();
		
		customerRepository.deleteById(customer);
		return existingCustomer;
	}

	@Override
	public Customer viewCustomer(int customer) {
		
		
		Optional<Customer> optional = customerRepository.findById(customer);
		Customer existingCustomer =((Optional<Customer>) optional).get();
		return existingCustomer;
		
				
		
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Optional<Customer> optional = customerRepository.findById(customer.getCustomerId());
		Customer existingCustomer =((Optional<Customer>) optional).get();
		customerRepository.save(customer);
		return customer;
		
	}

	@Override
	public List<Book> listAllCustomersByBook() {
		
		return null;
		
		
		
	}

}
