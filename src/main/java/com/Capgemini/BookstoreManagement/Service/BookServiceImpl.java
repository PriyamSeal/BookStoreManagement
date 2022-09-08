package com.Capgemini.BookstoreManagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.Capgemini.BookstoreManagement.Entity.Book;
import com.Capgemini.BookstoreManagement.Entity.Customer;
import com.Capgemini.BookstoreManagement.Repository.IBookRepository;
import com.Capgemini.BookstoreManagement.Repository.ICategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookSerivce {
	
	@Autowired
	IBookRepository bookServiceRepo;
	@Autowired
	ICategoryRepository categoryRepo;

	@Override
	public Book createBook(Book b) {
		// TODO Auto-generated method stub
		bookServiceRepo.save(b);
		return b;
		
	
	}

	@Override
	public List<Book> listAllBooks() {
		// TODO Auto-generated method stub
		return bookServiceRepo.findAll();
	}

	@Override
	public Book deleteBook(int book) {
		// TODO Auto-generated method stub
		Optional<Book> optional = bookServiceRepo.findById(book);
		Book existingBook =((Optional<Book>) optional).get();
		
		bookServiceRepo.deleteById(book);
		return existingBook;
		
	}

	@Override
	public Book editBook(Book b) {
		
		Optional<Book> optional= bookServiceRepo.findById(b.getBookId());
		Book book=((Optional<Book>) optional).get(); //handle exception
		bookServiceRepo.save(b);
		
		return b;  
	}

	@Override
	public Book viewBook(int b) {
		// TODO Auto-generated method stub
		
		Optional<Book> optional= bookServiceRepo.findById(b);
		Book book=((Optional<Book>) optional).get();
		return book;
		
		//Handle Exception if There is no data.
		
		
	}

	@Override
	public List<Book> listBookByCategory(String cat) {
		
		List<Book> bookList= new ArrayList<Book>();
		bookList=bookServiceRepo.findAll();
		List<Book>listBookByCategory=new ArrayList<>();
		for(Book b : bookList)
		{
			if(cat.equals(b.getCategory().getCategoryName()))
			{
				listBookByCategory.add(b);
			}
		}
		return listBookByCategory;
		
	
		
	}

	@Override
	public List<Book> listBestSellingBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
