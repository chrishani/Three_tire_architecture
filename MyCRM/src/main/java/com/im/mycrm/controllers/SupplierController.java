package com.im.mycrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.im.mycrm.enitities.Customer;
import com.im.mycrm.enitities.Supplier;
import com.im.mycrm.repositories.SupplierRepository;

@RestController
public class SupplierController {

	@Autowired
	SupplierRepository supplierRepository;
	
	@GetMapping("/suppliers")
	public List<Supplier> getSupplier(){
		return supplierRepository.findAll();
	}
	
	@GetMapping("/supplier/{id}")
	public Supplier getSupplier(@PathVariable Long id){
		return supplierRepository.findById(id).get();
	}
}
