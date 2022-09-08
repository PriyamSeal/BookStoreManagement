package com.Capgemini.BookstoreManagement.Repository;

import com.Capgemini.BookstoreManagement.Entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {

}
