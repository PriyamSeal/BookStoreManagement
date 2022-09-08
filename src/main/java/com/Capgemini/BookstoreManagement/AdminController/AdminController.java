package com.Capgemini.BookstoreManagement.AdminController;

import java.util.List;

import com.Capgemini.BookstoreManagement.Entity.Book;
import com.Capgemini.BookstoreManagement.Entity.Category;
import com.Capgemini.BookstoreManagement.Entity.Customer;
import com.Capgemini.BookstoreManagement.Entity.Review;
import com.Capgemini.BookstoreManagement.Service.IBookSerivce;
import com.Capgemini.BookstoreManagement.Service.ICategoryService;
import com.Capgemini.BookstoreManagement.Service.ICustomerService;
import com.Capgemini.BookstoreManagement.Service.IReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	IBookSerivce bookService;
	@Autowired
	ICategoryService categoryService;
	@Autowired
	ICustomerService customerService;
	@Autowired
	IReviewService reviewService;
	
	@GetMapping("/index")
	public String home()
	{
		return "Admin Home Page";
	}
	
	//1.Book Related Operations---->
	
	@PutMapping(path="/editBook", consumes="application/json")
	public Book editBook(@RequestBody Book b)
	{
		return bookService.editBook(b);
	}
	
	@PostMapping(path="/saveBook", consumes="application/json")
	public String addBook(@RequestBody Book b)
	{
		bookService.createBook(b); //It should Return String Msg.
		return "Book Added";
	}
	
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
	@DeleteMapping("/deleteBook/{id}")
	public Book deleteBook(@PathVariable int id)
	{
		return bookService.deleteBook(id);
	}
	
	@GetMapping("/listBookByCategory/{cat}")
	public List<Book> listBookByCategory(@PathVariable String cat)
	{
		return bookService.listBookByCategory(cat);
	}
	
	
	//2.Customer Related Operations-->
	
	@GetMapping("/listCustomers")
	public List<Customer> listCustomers()
	{
		return customerService.listCustomers();
	}
	
	
	//3.Category Related Operations--->
	
	@PostMapping(path="/addCategory", consumes="application/json")
	public String addCategory(@RequestBody Category c)
	{
		categoryService.addCategory(c);  //We should Change Parameter Type as Object.
		return "Category Added";
		
	}
	@GetMapping("/viewAllCategory")
	public List<Category> viewAllCategory()
	{
		return categoryService.viewAllCategories();
	}
	
	@PutMapping(path="/editCategory",consumes="application/json")
	public Category editCategory(@RequestBody Category c)
	{
		return categoryService.editCategory(c);
	}
	
	@DeleteMapping("/deleteCategory/{cat}")
	public Category deleteCategory(@PathVariable int cat)
	{
		return categoryService.removeCategory(cat);
	}
	
	//Review Relation Operations--->
	
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
	
	@GetMapping("/listAllReviewByCustomer")
	public List<Review> listAllReviewByCustomer(@RequestBody Customer customer)
	{
		return reviewService.listAllReviewByCustomer(customer);
	}
	
	
	
}

