package pt.dneves.shopping.app.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {

	private LocalDate bestBefore;
	private BigDecimal discount;

	public Food() {
		super();
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
	protected void overrideAccessModifier() {
		// do nothing
	}
	
}
