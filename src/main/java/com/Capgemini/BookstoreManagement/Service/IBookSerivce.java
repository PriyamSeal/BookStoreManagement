package com.Capgemini.BookstoreManagement.Service;

import java.util.List;

import com.Capgemini.BookstoreManagement.Entity.Book;

public interface IBookSerivce {
	
	public Book createBook(Book b); //done
	public List<Book>listAllBooks(); //done
	public Book deleteBook(int b); //done
	public Book editBook(Book b); //done
	public Book viewBook(int b);	 //done
	public List<Book> listBookByCategory(String cat); //done
	public List<Book> listBestSellingBook();
	
	
	
	
}
