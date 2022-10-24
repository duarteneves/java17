package pt.dneves.shopping.appabstract.model;

import java.math.BigDecimal;

public class Tech extends Product {

	private String state;
	
	
	public Tech(int id, String name, BigDecimal price, String state) {
		super(id, name, price);
		this.state = state;
	}

	
	@Override
	public String getState() {
		return state;
	}

}
