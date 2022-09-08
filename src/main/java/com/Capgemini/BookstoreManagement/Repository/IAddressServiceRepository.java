package com.Capgemini.BookstoreManagement.Repository;

import com.Capgemini.BookstoreManagement.Entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressServiceRepository extends JpaRepository<Address,Integer> {

}
