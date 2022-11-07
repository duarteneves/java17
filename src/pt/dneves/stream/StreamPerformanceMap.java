package pt.dneves.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

import pt.dneves.shopping.app.model.Product;

public class StreamPerformanceMap {

	public static void main(String[] args) {
		
		
		List<Product> list = new ArrayList<>();
		
		
		Function<Product, String> names = p -> p.getName();
		UnaryOperator<String> trim = n -> n.trim();
		ToIntFunction<String> length = n -> n.length();
		
		int sum = list.stream()
			.map(names.andThen(trim))
			.mapToInt(length)
			.sum();

		
		
	}
	
}
