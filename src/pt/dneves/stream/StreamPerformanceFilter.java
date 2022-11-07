package pt.dneves.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Product;

public class StreamPerformanceFilter {

	public static void main(String[] args) {
		
		
		List<Product> list = new ArrayList<>();
		
		
		Predicate<Product> foodFilter = p -> p instanceof Food;
		Predicate<Product> priceFilter = p -> p.getPrice().compareTo(BigDecimal.valueOf(2)) < 0;
			
		// and, or, negate
		list.stream()
			.filter(foodFilter.negate().or(priceFilter))
			.forEach(p -> p.applyDiscound(BigDecimal.valueOf(0.1)));

		
		// Predicate isEqual, not
		list.stream()
			.filter(Predicate.isEqual(new Food("Cake")))
			.forEach(p -> p.applyDiscound(BigDecimal.valueOf(0.1)));
		
		
	}
	
}
