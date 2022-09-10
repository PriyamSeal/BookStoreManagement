package com.bootcamp.bookstoremanagement.Service;

import com.bootcamp.bookstoremanagement.Entity.User;
import com.bootcamp.bookstoremanagement.Repository.ILoginRepository;
import com.bootcamp.bookstoremanagement.exception.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerUserDetailsService implements UserDetailsService {
	
	@Autowired
	ILoginRepository loginRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=loginRepository.findByEmail(username);
		
		if(user==null)
		{
			throw new UserNotFoundException("User Not Found");
		}
		
		return new CustomerUserDetails(user);
	}

}
