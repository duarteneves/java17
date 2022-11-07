package pt.dneves.stream;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Product;

public class InterfacesFuncionais {


	public static void main(String[] args) {
	
		
		List<Product> list = new ArrayList<>();
		
		
		list.stream()
			.filter(new Predicate<Product>() {
	
				@Override
				public boolean test(Product p) {
					return p.getPrice().doubleValue() > 8.0;
				}
				
			})
			.peek(new Consumer<Product>() {

				@Override
				public void accept(Product p) {
					p.applyDiscound(BigDecimal.valueOf(0.1));
				}
			
			})
			.map(new Function<Product, LocalDate>() {

				@Override
				public LocalDate apply(Product p) {
					return p.getBestBefore();
				}
			
			})
			.forEach(new Consumer<LocalDate>() {

				@Override
				public void accept(LocalDate d) {
					d.plusDays(1);
				}
			
			});
		
		
		
		list.stream()	// produz uma stream de produtos a partir da list
			.filter(p -> p.getPrice().doubleValue() > 8.0)	// Predicate - filtra os produtos cujo preço é superior a 8
			.peek(p -> p.applyDiscound(BigDecimal.valueOf(0.1)))	// Consumer - aplica aos produtos filtrados anterioremente um desconto de 0.1
			.map(p -> p.getBestBefore())	// Function - produz uma stream de objetos LocalDate
			.forEach(d -> d.plusDays(1));	// Consumer - atualiza cada um dos produtos da stream a data de validade para mais um dia 
		
		
		
		
		int sum = IntStream.generate(() -> (int) (Math.random() * 10))	// Supplier - produz elementos
				.takeWhile(n -> n != 3)
				.sum();

		
		Stream<Integer> numbers = Stream.iterate(0, n -> n + 10);	// UnaryOperator - criar uma stream com todos os múltiplos de 10
	
		
		
		
		// BiConsumer - Par de elementos

		Product p1 = new Food(1, "Cake", BigDecimal.valueOf(4.55));
		Product p2 = new Drink(2, "Cake", BigDecimal.valueOf(1.20));
		
		Map<Integer, Product> items = new HashMap<>();
		
		items.put(Integer.valueOf(p1.getId()), p1);
		items.put(Integer.valueOf(p2.getId()), p2);
		
		items.forEach((k, v) -> v.getPrice().multiply(BigDecimal.valueOf(k.intValue())));
		
	}
	
}
