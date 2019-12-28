package com.im.item.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.im.item.model.Item;

public class ItemDaoImpl extends HibernateDaoSupport implements ItemDao{
	//add the item  
	public void addItem(Item item){
		getHibernateTemplate().save(item);
	}
   //return all the items in list  
	public List<Item> listItem(){
		return  getHibernateTemplate().find("from Item");
	}   
}
