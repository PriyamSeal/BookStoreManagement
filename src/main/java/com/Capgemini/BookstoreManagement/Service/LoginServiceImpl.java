package com.Capgemini.BookstoreManagement.Service;

import com.Capgemini.BookstoreManagement.Entity.User;
import com.Capgemini.BookstoreManagement.Repository.ILoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	ILoginRepository iLoginRepo;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		iLoginRepo.save(user);
		return user;
	}

	@Override
	public User removeUser(User user) {
		
		iLoginRepo.deleteById(user.getUserId());
		
		return null;
	}

	@Override
	public User validateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
