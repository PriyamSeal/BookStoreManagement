package com.Capgemini.BookstoreManagement.Service;

import java.util.List;

import com.Capgemini.BookstoreManagement.Entity.Book;
import com.Capgemini.BookstoreManagement.Entity.Customer;

public interface ICustomerService {
	
	public Customer createCustomer(Customer c);
	public List<Customer> listCustomers(); // Admin
	public Customer deleteCustomer(int c);
	public Customer viewCustomer(int c);
	public Customer updateCustomer(Customer c);
	public List<Book> listAllCustomersByBook();

}
