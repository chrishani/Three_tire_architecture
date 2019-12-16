package com.im.supplier.bo;

import java.util.List;

import com.im.supplier.dao.SupplierDao;
import com.im.supplier.model.Supplier;

public class SupplierBoImpl implements SupplierBo{
	SupplierDao supplierDao;  
	//DI via Spring  
	public void setSupplierDao(SupplierDao supplierDao) {
		this.supplierDao = supplierDao;
	} 
	 
	 //call Dao to save customer  
	public void addSupplier(Supplier supplier){
		supplierDao.addSupplier(supplier);
	}    
	
	//call Dao to return customers  
	public List<Supplier> listSupplier(){
		return supplierDao.listSupplier();
	} 
	
	
}
