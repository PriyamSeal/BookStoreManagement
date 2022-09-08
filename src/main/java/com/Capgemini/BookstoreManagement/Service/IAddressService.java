package com.Capgemini.BookstoreManagement.Service;

import java.util.List;

import com.Capgemini.BookstoreManagement.Entity.Address;

public interface IAddressService {
	
	public Address addAddress(Address address);
    public Address editAddress(Address address);
    public Address deleteAddress(int address);
    public List<Address> viewAllAddresses();

}
