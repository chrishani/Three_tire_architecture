package com.im.item.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.im.item.bo.ItemBo;
import com.im.item.model.Item;
import com.opensymphony.xwork2.ModelDriven;

public class ItemAction implements ModelDriven{
	Item item = new Item();
	List<Item> itemList = new ArrayList<Item>();
	ItemBo itemBo;   
	
	//Getters & Setters Here 
	
	
	public Object getModel() {
		return item;
	}
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public ItemBo getItemBo() {
		return itemBo;
	}

	public void setItemBo(ItemBo itemBo) {
		this.itemBo = itemBo;
	}

	public String addItem() throws Exception{
		item.setCreatedDate(new Date());
		itemBo.addItem(item);
		itemList = itemBo.listItem();   return "success";
	}
	
	public String listItem() throws Exception{
		itemList = itemBo.listItem();   return "success";  }   
}
