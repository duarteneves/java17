package pt.dneves.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Product;

public class StreamPerformanceReduce {

	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		int count = 0;
		
		for (Integer integer : numbers) {
			count += integer;
		}

		System.out.println(count);
		
		
		int result = numbers.stream()
				.reduce(0, (subtotal, element) -> subtotal + element);

		// int result = numbers.stream().reduce(0, Integer::sum);
		
		System.out.println(result);
		
		
		
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		
		String word = letters.stream()
			  .reduce(
		    "", (partialString, element) -> partialString + element.toUpperCase());
		
		System.out.println(word);

		
		
		List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);

		int computedAges = ages.stream()
				.parallel()
				.reduce(0, (subtotal, element) -> subtotal + element, Integer::sum);
		
		System.out.println(computedAges);
		
		
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Food("Rice 1"));
		products.add(new Drink("Juice 1"));
		products.add(new Food("Rice 2"));
		products.add(new Drink("Juice 2"));

		
		Optional<String> optional = products.stream()
			.map(p -> p.getName())
			.reduce((s1, s2) -> s1 + " " + s2);
	
		System.out.println(optional.get());

		
		String reduce = products.stream()
				.map(p -> p.getName())
				.reduce("", (s1, s2) -> s1 + " | " + s2);
		
		System.out.println(reduce);

		
		reduce = products.stream()
				.parallel()
				.reduce("", (s, p) -> p.getName() + " ? " + s, (s1, s2) -> s1 + s2);
		
		System.out.println(reduce);
		
	}
	
}
