package pt.dneves.list;

import java.util.ArrayList;
import java.util.List;

import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Product;

public class Operations {


	private static void operations() {
		
		Product p1 = new Food("Cake");
		Product p2 = new Drink("Tea");
		
		List<Product> menu = new ArrayList<>();
		
		menu.add(p1);
		menu.add(p2);
		menu.add(2, null);
		menu.add(3, p1);
		menu.add(2, p1);
		menu.set(2, p2);
		
		menu.remove(0);
		menu.remove(p2);
		
		boolean hasTea = menu.contains(p2);
		System.out.println(hasTea);
		
		int indexOfCake = menu.indexOf(p1);
		System.out.println(indexOfCake);
		
		System.out.println(menu.get(0).getName());
		menu.get(0).setName("Cookie");
		System.out.println(menu.get(0).getName());
		
//		menu.add(p2);
//		menu.add(3, p2);
//		menu.add(4, p2);
		
	}
	
	
	public static void main(String[] args) {

		operations();
		
	}	

}
