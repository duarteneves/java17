package pt.dneves.shopping.app.model;

import java.math.BigDecimal;

public class Drink extends Product {

	public Drink() {
		super();
	}
	
	public Drink(String name) {
		super(name);
	}
	
	public Drink(int id, String name, BigDecimal price) {
		super(id, name, price);
	}

	
}
