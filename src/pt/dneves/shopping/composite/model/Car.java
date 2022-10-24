package pt.dneves.shopping.composite.model;

import java.math.BigDecimal;

public class Car extends Product implements Tecnical, Review {

	private int year;
	private int kms;
	
	public Car(int id, String name, BigDecimal price, int year, int kms) {
		super(id, name, price);
		this.year = year;
		this.kms = kms;
	}
	
	@Override
	public String getState() {
		return year + " . " + kms + " kms";
	}

	@Override
	public void reviews() {
		//
	}

	@Override
	public void tecnical() {
		//
	}

}
