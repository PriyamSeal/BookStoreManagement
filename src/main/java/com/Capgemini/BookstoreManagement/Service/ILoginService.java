package com.Capgemini.BookstoreManagement.Service;

import com.Capgemini.BookstoreManagement.Entity.User;

public interface ILoginService {
	
	public User addUser(User user);
	public User removeUser(User user);
	public User validateUser(User user);
	
	

}
