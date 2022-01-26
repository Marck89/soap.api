package my.soap.api.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import my.soap.api.Item;

public class ItemServiceImpl implements ItemService {

	private static Map<Integer,Item> Items = new HashMap<Integer,Item>();
	
	@Override
	public boolean addItem(Item p) {
		if(Items.get(p.getId()) != null) return false;
		Items.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean deleteItem(int id) {
		if(Items.get(id) == null) return false;
		Items.remove(id);
		return true;
	}

	@Override
	public Item getItem(int id) {
		return Items.get(id);
	}

	@Override
	public Item[] getAllItems() {
		Set<Integer> ids = Items.keySet();
		Item[] p = new Item[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = Items.get(id);
			i++;
		}
		return p;
	}

}