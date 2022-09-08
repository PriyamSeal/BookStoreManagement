package com.Capgemini.BookstoreManagement.Service;

import java.util.List;

import com.Capgemini.BookstoreManagement.Entity.Book;
import com.Capgemini.BookstoreManagement.Entity.Customer;
import com.Capgemini.BookstoreManagement.Entity.Review;

public interface IReviewService {
	
	public List<Review> listAllReviews();  //done both
	public Review addReview(Review review); //done user
	public Review updateReview(Review review); // done user
	public Review deleteReview(int review); // user
	public Review viewReview(int review); // both
	public List<Review> listAllReviewsByBook(Book book); //both
	public List<Review> listAllReviewByCustomer(Customer customer); //both
	public List<Book> listMostFavoredBooks();
	
	

}
