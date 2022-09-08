package com.Capgemini.BookstoreManagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.Capgemini.BookstoreManagement.Entity.Book;
import com.Capgemini.BookstoreManagement.Entity.Customer;
import com.Capgemini.BookstoreManagement.Entity.Review;
import com.Capgemini.BookstoreManagement.Repository.IReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements IReviewService {
	
	@Autowired
	private IReviewRepository reviewRepository;
	
	@Override
	public List<Review> listAllReviews() {
		return reviewRepository.findAll();
	}

	@Override
	public Review addReview(Review review) {
		
		reviewRepository.save(review);
		return review;
	}

	@Override
	public Review updateReview(Review review) {
		Optional<Review> optional = reviewRepository.findById(review.getReviewId());
		Review existingReview = ((Optional<Review>) optional).get();
		reviewRepository.save(review);
		return review;
	}

	@Override
	public Review deleteReview(int review) {
			
		Optional<Review> optional = reviewRepository.findById(review);
		Review existingReview = ((Optional<Review>) optional).get();
		reviewRepository.deleteById(review);;
		return existingReview ;
	}

	@Override
	public Review viewReview(int review) {
		Optional<Review> optional = reviewRepository.findById(review);
		Review existingReview = ((Optional<Review>) optional).get();
		return existingReview;
	}

	@Override
	public List<Review> listAllReviewsByBook(Book book) {
		List<Review> reviewList = reviewRepository.findAll();
		List<Review> reviewListByBook = new ArrayList<>();
		for(Review r : reviewList){
			if(book.equals(r.getBook()))
					{
						reviewListByBook.add(r);
					}	
		}
		return reviewListByBook;
	}

	@Override
	public List<Review> listAllReviewByCustomer(Customer customer) {
		List<Review> reviewList = reviewRepository.findAll();		
		List<Review> reviewsByCustomer = new ArrayList<>();
		for(Review r : reviewList){
			if(customer.equals(r.getCustomer()))
				reviewsByCustomer.add(r);
		}
		return reviewsByCustomer;
	}

	@Override
	public List<Book> listMostFavoredBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
