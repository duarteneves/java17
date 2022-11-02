package pt.dneves.map;

import java.util.HashMap;
import java.util.Map;

import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Product;

public class Operations {

	public static void main(String[] args) {
		
		Product p1 = new Food("Cake");
		Product p2 = new Drink("Tea");

		
		Map<Product, Integer> items = new HashMap<>();
		
		
		items.put(p1, Integer.valueOf(2));
		items.put(p2, Integer.valueOf(2));

		Integer n1 = items.put(p1, Integer.valueOf(5));
		Integer n2 = items.remove(p2);
		
		System.out.println(n1);
		System.out.println(n2);

		
		boolean containsKey = items.containsKey(p2);
		boolean containsValue = items.containsValue(n1);
		
		System.out.println(containsKey);
		System.out.println(containsValue);
		
		
		Integer integer = items.get(p1);
		System.out.println(integer);
		
	}
	
}
