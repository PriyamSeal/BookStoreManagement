package com.Capgemini.BookstoreManagement.Service;

import java.util.List;
import java.util.Optional;

import com.Capgemini.BookstoreManagement.Entity.Address;
import com.Capgemini.BookstoreManagement.Repository.IAddressServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements IAddressService {

	@Autowired
    private IAddressServiceRepository addressRepository;
    @Override
    public Address addAddress(Address address){
        addressRepository.save(address);
        return address;
    }
    @Override
    public Address editAddress(Address address){
        Optional<Address> optional = addressRepository.findById(address.getAddressId());
        Address existingAddress = ((Optional<Address>) optional).get();
        addressRepository.save(address);
        return address;
    }
    @Override
    public Address deleteAddress(int address){
        
    	Optional<Address> optional = addressRepository.findById(address);
        Address existingAddress = ((Optional<Address>) optional).get();
    	addressRepository.deleteById(address);
        return existingAddress;
    }
    @Override
    public List<Address> viewAllAddresses(){
        return addressRepository.findAll();
    }

}
