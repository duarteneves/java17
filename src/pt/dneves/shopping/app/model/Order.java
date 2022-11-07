package pt.dneves.shopping.app.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Product> items;
	
	public Order() {
		this.items = new ArrayList<>();
	}
	
	public List<Product> getItems() {
		return items;
	}
	
}
