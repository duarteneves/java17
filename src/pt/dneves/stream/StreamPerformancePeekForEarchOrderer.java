package pt.dneves.stream;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import pt.dneves.shopping.app.model.Product;

public class StreamPerformancePeekForEarchOrderer {

	public static void main(String[] args) {
		
		
		List<Product> list = new ArrayList<>();
		
		list.stream()
			.forEach(p -> System.out.println(p.getName()));

		
		Consumer<Product> expire = (p) -> p.setBestBefore(LocalDate.now());
		Consumer<Product> discount = (p) -> p.applyDiscound(BigDecimal.valueOf(1.0));


		// andThen
		list.stream()
			.forEach(expire.andThen(discount));

		
		// parallel stream -> forEach
		// stream -> forEachOrderer
		
		list.parallelStream()
			.peek(expire)
			.filter(p -> p.getPrice().doubleValue() > 10.0)
			.forEach(discount);

		list.stream()
			.peek(expire)
			.filter(p -> p.getPrice().doubleValue() > 10.0)
			.forEachOrdered(discount);
		
		
	}
	
}
