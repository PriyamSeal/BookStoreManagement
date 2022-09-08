package com.Capgemini.BookstoreManagement.Repository;

import com.Capgemini.BookstoreManagement.Entity.Review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IReviewRepository extends JpaRepository<Review,Integer> {

}
