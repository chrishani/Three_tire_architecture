package com.im.supplier.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.im.supplier.model.Supplier;

public class SupplierDaoImpl extends HibernateDaoSupport implements SupplierDao{
	//add the customer  
		public void addCustomer(Supplier supplier){
			getHibernateTemplate().save(supplier); 
		}
		//return all the customers in list  
		public List<Supplier> listSupplier(){
			return  getHibernateTemplate().find("from Supplier"); 
		}  
		
		
}
