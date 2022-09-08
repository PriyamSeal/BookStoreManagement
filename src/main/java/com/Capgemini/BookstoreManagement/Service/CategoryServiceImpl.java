package com.Capgemini.BookstoreManagement.Service;

import java.util.List;
import java.util.Optional;

import com.Capgemini.BookstoreManagement.Entity.Category;
import com.Capgemini.BookstoreManagement.Repository.ICategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public Category addCategory(Category categoryName){
        categoryRepository.save(categoryName);
        return categoryName;
    }
    @Override
    public Category editCategory(Category category){
        Optional<Category> optional= categoryRepository.findById(category.getCategoryId());
        Category existingCategory=((Optional<Category>) optional).get();
        categoryRepository.save(category);
        return category;
    }

    @Override
    public List<Category> viewAllCategories(){
        return categoryRepository.findAll();
    }
    @Override
    public Category removeCategory(int category){
        
    	Optional<Category> optional= categoryRepository.findById(category);
        Category existingCategory=((Optional<Category>) optional).get();
    	categoryRepository.deleteById(category);;
        return existingCategory;
    }



}
