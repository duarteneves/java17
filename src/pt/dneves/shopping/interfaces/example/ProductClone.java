package pt.dneves.shopping.interfaces.example;

import java.math.BigDecimal;

import pt.dneves.shopping.app.model.Product;

public class ProductClone {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "a", BigDecimal.valueOf(1.0));

		try {
			
			// clone is protected
			// must be implemented by subclass
			Product product2 = (Product) product1.clone();
			
			System.out.println(product2.getName());
			
		} catch (CloneNotSupportedException e) {
			// must implements Cloneable
			e.printStackTrace();
		}
		
	}
	
}
