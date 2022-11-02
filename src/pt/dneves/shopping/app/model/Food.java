package pt.dneves.shopping.app.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {

	public static int CONSTANTS = 1;
	
	
	private LocalDate bestBefore;
	private BigDecimal discount;

	
	public Food() {
		super();
	}

	public Food(String name) {
		super(name);
	}

	public Food(int id, String name, BigDecimal price, BigDecimal discount) {
		super(id, name, price);
		this.discount = discount;
	}


	@Override
	public LocalDate getBestBefore() {
		return bestBefore;
	}
	
	/**
	 * this vs super
	 */
	public BigDecimal getDiscount() {
		return getPrice().subtract(this.discount.add(super.discount));
	}
	
	@Override
	public void overrideAccessModifier() {
		// do nothing
	}
	
}
