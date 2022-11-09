package pt.dneves.shopping.app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private Customer customer;
	private LocalDate date;
	private List<Product> items;
	
	public Order() {
		this.items = new ArrayList<>();
	}

	public Order(Customer customer) {
		this.customer = customer;
		this.date = LocalDate.now();
		this.items = new ArrayList<>();
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public List<Product> getItems() {
		return items;
	}
	
	public void addItem(Product product) {
		this.items.add(product);
	}
	
}
