package com.Capgemini.BookstoreManagement.UserController;

import java.util.List;

import com.Capgemini.BookstoreManagement.Entity.Address;
import com.Capgemini.BookstoreManagement.Entity.Book;
import com.Capgemini.BookstoreManagement.Entity.Customer;
import com.Capgemini.BookstoreManagement.Entity.Review;
import com.Capgemini.BookstoreManagement.Entity.User;
import com.Capgemini.BookstoreManagement.Repository.ILoginRepository;
import com.Capgemini.BookstoreManagement.Service.IAddressService;
import com.Capgemini.BookstoreManagement.Service.IBookSerivce;
import com.Capgemini.BookstoreManagement.Service.ICategoryService;
import com.Capgemini.BookstoreManagement.Service.ICustomerService;
import com.Capgemini.BookstoreManagement.Service.ILoginService;
import com.Capgemini.BookstoreManagement.Service.IOrderService;
import com.Capgemini.BookstoreManagement.Service.IReviewService;

import org.jvnet.hk2.internal.InstantiationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IBookSerivce bookService;
	
	@Autowired
	ILoginService loginService;
	@Autowired
	IBookSerivce bookservice;
	@Autowired
	IOrderService orderService;
	@Autowired
	IReviewService reviewService;
	@Autowired
	ICategoryService categoryService;
	@Autowired
	ICustomerService customerService;
	
	@Autowired
	IAddressService addressService;
	
	
	@GetMapping("/index")
	public String  home()
	{
		return "User Home";
	}
	
	//Login Related Activity--->
	
	@PostMapping(path="/register", consumes="application/json")
	public User registerationUser(@RequestBody User user)
	{
		
		return loginService.addUser(user);
		
		
	}
	
	//Customer Related Activity-->
	
	@PostMapping(path="/saveCustomer", consumes="application/json")
	public String saveCustomer(@RequestBody Customer c)
	{
		customerService.createCustomer(c); //Return Type Should Be String
		return "Customer Added";
	
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public String deleterCustomer(@PathVariable Integer id)
	{
		customerService.deleteCustomer(id);
		return "Customer Deleted";
	}
	
	@GetMapping("/viewCustomer/{id}")
	public Customer viewCustomer(@PathVariable int id)
	{
		return customerService.viewCustomer(id);
	}
	
	@PutMapping(path="/updateCustomer",consumes="application/json")
	public Customer updateCustomer(@RequestBody Customer cus)
	{
		return customerService.updateCustomer(cus);
	}
	
	
	//Book Related Activity-->
	
	@GetMapping("/getBook/{id}")
	public Book getBook(@PathVariable Integer id) //We should Search/Get a book by its id or name.
	{	
		return bookService.viewBook(id);
		
	}
	
	@GetMapping("/getAllBooks")
	public List<Book>getAllBooks()
	{
		return bookService.listAllBooks();
	}
	
	@GetMapping("/listBookByCategory/{cat}")
	public List<Book> listBookByCategory(@PathVariable String cat)
	{
		return bookService.listBookByCategory(cat);
	}
	
	
	//Review Related Activity-->
	
	@PutMapping(path="/updateReview",consumes="application/json")
	public Review updateReview(@RequestBody Review review)
	{
		return reviewService.addReview(review);
	}
	
	@PostMapping(path="/addReview",consumes="application/json")
	public Review addReview(@RequestBody Review review)
	{
		return reviewService.addReview(review);
	}
	
	@GetMapping("/listAllReviews")
	public List<Review> listAllReviews()
	{
		return reviewService.listAllReviews();
	}
	
	@DeleteMapping("/deleteReview/{id}")
	public Review deleteReview(@PathVariable int id)
	{
		return reviewService.deleteReview(id);
	}
	
	@GetMapping(path="/viewReview/{review}",consumes="application/json")
	public Review viewReview(@PathVariable int review)
	{
		return reviewService.viewReview(review);
	}
	
	@GetMapping("/listAllReviewsByBook")
	public List<Review> listAllReviewsByBook(@RequestBody Book book)
	{
		return reviewService.listAllReviewsByBook(book);
	}
	
	
	//Address Related Activity-->
	
	@PostMapping(path="/addAddress",consumes="application/json")
	public String addAddress(@RequestBody Address address)
	{
		addressService.addAddress(address);
		return "Address Added";
	}
	
	 @PutMapping(path="/editAddress",consumes="application/json")
	 public Address editAddress(@RequestBody Address address)
	 {
		 return addressService.editAddress(address);
		 
	 }
	 
	 @DeleteMapping("/deleteAddress/{address}")
	 public Address deleteAddress(@PathVariable int address)
	 {
		 return addressService.deleteAddress(address);
	 }
	
	
	
}
