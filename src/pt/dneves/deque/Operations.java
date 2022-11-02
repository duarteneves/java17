package pt.dneves.deque;

import java.util.ArrayDeque;
import java.util.Deque;

import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Product;

public class Operations {

	public static void main(String[] args) {
		
		
		Product p1 = new Food("Cake");
		Product p2 = new Drink("Tea");
		Product p3 = new Food("Cookie");
		
		
		Deque<Product> menu = new ArrayDeque<>();
		
		Product pollFirst = menu.pollFirst();
		System.out.println(pollFirst);
		
		menu.offerFirst(p1);
		menu.offerFirst(p2);
		
		pollFirst = menu.pollFirst();
		System.out.println(pollFirst.getName());
		
		Product peekFirst = menu.peekFirst();
		System.out.println(peekFirst.getName());

		
		menu.offerLast(p3);
		menu.offerLast(p1);
		
		Product pollLast = menu.pollLast();
		System.out.println(pollLast.getName());

		Product peekLast = menu.peekLast();
		System.out.println(peekLast.getName());
		
		
		// throw NPE
		// menu.offerLast(null);
		
	}
	
}
