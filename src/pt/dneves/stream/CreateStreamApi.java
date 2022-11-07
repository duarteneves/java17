package pt.dneves.stream;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Product;

public class CreateStreamApi {
	
	
	public static void main(String[] args) {
		
		
		// infinito
		// IntStream, DoubleStream, LongStream
		// iniciar streams a partir de métodos estáticos
		
		int sum = IntStream.generate(() -> (int) (Math.random() * 10))
				.takeWhile(n -> n != 3)
				.sum();
		
		
		System.out.println(sum);

		
		// iniciar streams a partir de métodos estáticos
		
		Food rice = new Food("Rice");
		Drink juice = new Drink("Juice");
		
		Stream.of(rice, juice)
				.forEach(p -> { 
					double price = Math.random() * 10;
					p.setPrice(BigDecimal.valueOf(price));
				});
		
		
		// stream a partir de uma collection
		
		List<Product> products = new ArrayList<>();
		products.add(rice);
		products.add(juice);
				
		double total = products.stream()
				.parallel()
				.mapToDouble(p -> p.getPrice().doubleValue())
				.sum();

		
		System.out.println(new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN) + " €");
		
		
		// stream a partir de um array
		
		Product[] array = {rice, juice};
		
		Arrays.stream(array)
				.filter(p -> p.getPrice().doubleValue() > 5)
				.forEach(p -> p.applyDiscound(BigDecimal.valueOf(0.1)));
				
	}
	

}
