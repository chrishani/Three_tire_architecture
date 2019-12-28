package com.im.item.bo;

import java.util.List;

import com.im.item.model.Item;

public interface ItemBo {
	void addItem(Item item);
	List<Item> listItem(); 
}
