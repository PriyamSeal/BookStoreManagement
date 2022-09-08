package com.Capgemini.BookstoreManagement.Repository;

import com.Capgemini.BookstoreManagement.Entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Integer> {

}
