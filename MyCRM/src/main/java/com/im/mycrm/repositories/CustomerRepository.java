package com.im.mycrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.mycrm.enitities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	
}
