package pt.dneves.shopping.composite.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Product {

	private int id;
	private String name;
	private BigDecimal price;
	private LocalDate bestBefore;


	public Product() {
		// do nothing
	}
	
	public Product(int id, String name, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product(int id, String name, BigDecimal price, LocalDate bestBefore) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.bestBefore = bestBefore;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getBestBefore() {
		return bestBefore;
	}
	
	public abstract String getState();
	
}
