package com.im.item.bo;

import java.util.List;

import com.im.item.dao.ItemDao;
import com.im.item.model.Item;

public class ItemBoImpl implements ItemBo{
	ItemDao itemDao;
	
	//DI via Spring  
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	} 
	 
	 //call Dao to save item  
	public void addItem(Item item){
		itemDao.addItem(item);
	}
	
	//call Dao to return items
	public List<Item> listItem(){
		return itemDao.listItem();  }
}
