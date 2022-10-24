package pt.dneves.constant;

import java.math.BigDecimal;

import pt.dneves.shopping.app.model.Product;

public class Constant {

	public static void main(String[] args) {
		
		final Product product = new Product();
		
		product.setPrice(BigDecimal.valueOf(1.99));
		
		System.out.println("Price: " + product.getPrice().doubleValue());

		
//		product = new Product();

	}
	
}
