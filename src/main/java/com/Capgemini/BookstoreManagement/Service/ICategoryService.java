package com.Capgemini.BookstoreManagement.Service;

import java.util.List;

import com.Capgemini.BookstoreManagement.Entity.Category;

public interface ICategoryService {
	
	public Category addCategory(Category c); //done
	public Category editCategory(Category cat); //done 
	public List<Category> viewAllCategories(); //done
	public Category removeCategory(int cat); //done --> Changed Object Type to int
	

}
