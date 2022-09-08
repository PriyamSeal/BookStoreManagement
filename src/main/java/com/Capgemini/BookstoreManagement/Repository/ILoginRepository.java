package com.Capgemini.BookstoreManagement.Repository;

import com.Capgemini.BookstoreManagement.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ILoginRepository extends JpaRepository<User,Integer> {

}
