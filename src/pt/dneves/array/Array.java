package pt.dneves.array;

import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Product;

public class Array {


	public void declarationAndCreation() {
		
		int[] primes = new int[3];
		
		primes[0] = 2;
		primes[1] = 3;
		primes[primes.length - 1] = 5;
		
		System.out.println(primes[0]);
		
		
		Product[] products = new Product[3];

		products[0] = new Food();
		products[1] = new Drink();
		products[2] = new Food();

	}
	
	
	public void creationAndInitialization() {
		
		int[] primes;
		primes = new int[] {2, 3, 5};
		
		
		Product[] products;
		
		products = new Product[] {
				new Food(),
				new Drink(),
				new Food()};
		
	}
	
	
	public void declarationAndCreationAndInitialization() {

		int[] primes = {2, 3, 5};
		
		Product[] products = {
				new Food(),
				new Drink(),
				new Food()};
		
	}
	
}
