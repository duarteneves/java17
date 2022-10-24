package pt.dneves.overload;

import java.math.BigDecimal;

public class Overload {

	private BigDecimal price;
	private BigDecimal discount = BigDecimal.ZERO;
	
	public BigDecimal setPrice() {
		this.price = BigDecimal.valueOf(1.0);
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public void setPrice(double price) {
		this.price = BigDecimal.valueOf(price);
	}

	public void setPrice(BigDecimal price, BigDecimal discount) {
		setPrice(price.doubleValue());
		this.discount = discount;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public BigDecimal getDiscount() {
		return discount;
	}
	
	
	public static void main(String[] args) {
		
		Overload overload = new Overload();
		
		overload.setPrice(2.99);
		overload.setPrice(BigDecimal.valueOf(5.0));
		overload.setPrice(BigDecimal.valueOf(5.0),
				BigDecimal.valueOf(0.33));
		
	}
	
}
