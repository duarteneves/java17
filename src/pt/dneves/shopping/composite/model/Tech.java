package pt.dneves.shopping.composite.model;

import java.math.BigDecimal;

public class Tech extends Product implements Tecnical, Review {

	private String state;
	
	
	public Tech(int id, String name, BigDecimal price, String state) {
		super(id, name, price);
		this.state = state;
	}

	
	@Override
	public String getState() {
		return state;
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
