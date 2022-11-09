package pt.dneves.nested.anonymous;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pt.dneves.shopping.app.model.Product;

public class AnonymousNestedCassMain {

	
	public static void main(String[] args) {
		
		
		Order order1 = new OrderOnline();
		System.out.println(order1.getDiscount().toString());
		
		
		Order order2 = new Order() {
			
			public java.math.BigDecimal getDiscount() {
				return BigDecimal.valueOf(0.2);
			};
			
		};
		System.out.println(order2.getDiscount().toString());
		
		
		
		List<Product> products = new ArrayList<>();
		
		Collections.sort(products, new Comparator<Product>() {
			
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
	}
	
}
