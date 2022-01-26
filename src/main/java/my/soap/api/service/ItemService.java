package my.soap.api.service;

import my.soap.api.Item;

public interface ItemService {

	public boolean addItem(Item p);
	
	public boolean deleteItem(int id);
	
	public Item getItem(int id);
	
	public Item[] getAllItems();
}