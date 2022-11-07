package pt.dneves.nested.anonymous;

import java.math.BigDecimal;

public class OrderOnline extends Order {

	@Override
	public BigDecimal getDiscount() {
		return BigDecimal.valueOf(0.1);
	}
	
}
