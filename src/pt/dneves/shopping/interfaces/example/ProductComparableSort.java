package pt.dneves.shopping.interfaces.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

import pt.dneves.shopping.app.model.Product;

public class ProductComparableSort {
	
	
	public static void main(String[] args) {
		
		
		Product[] products = {
			new Product(1, "b", BigDecimal.valueOf(1.0)),
			new Product(0, "a", BigDecimal.valueOf(1.0)),
			new Product(2, "c", BigDecimal.valueOf(1.0))
		};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		
		// without comparable
		
		Arrays.sort(products);
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		
		// with comparable at sort method
		
		Arrays.sort(products, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// String API interface Comparable
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		
		// with comparable at class
		
		Arrays.sort(products);
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
	}

}
