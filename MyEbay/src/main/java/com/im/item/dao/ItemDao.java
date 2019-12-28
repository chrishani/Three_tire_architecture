package com.im.item.dao;

import java.util.List;

import com.im.item.model.Item;

public interface ItemDao {
	void addItem(Item item);
	List<Item> listItem(); 
}
