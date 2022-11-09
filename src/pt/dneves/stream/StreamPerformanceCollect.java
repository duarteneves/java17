package pt.dneves.stream;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import pt.dneves.shopping.app.model.Customer;
import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Order;
import pt.dneves.shopping.app.model.Product;

public class StreamPerformanceCollect {

	
	public static void main(String[] args) {
		
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Food(1, "Rice 1", BigDecimal.valueOf(1.0)));
		products.add(new Drink(2, "Juice 1", BigDecimal.valueOf(2.0)));
		products.add(new Food(3, "Rice 2", BigDecimal.valueOf(3.0)));
		products.add(new Drink(4, "Juice 2", BigDecimal.valueOf(4.0)));

		
		// toList
		
		List<Product> drinks = products.stream()
				.filter(p -> p instanceof Drink)
				.collect(Collectors.toList());
		
		
		// mapping
		
		String string = products.stream()
			.collect(Collectors.mapping(p -> p.getName(), Collectors.joining(",")));

		System.out.println(string);
		
		
		// summarizingDouble
		
		DoubleSummaryStatistics stats = products.stream()
			.collect(Collectors.summarizingDouble(p -> p.getPrice().doubleValue()));
		
		System.out.println(stats);
		
		
		// partitioning
		
		Map<Boolean, List<Product>> types = products.stream()
					.collect(Collectors.partitioningBy(p -> p instanceof Drink));
	
		/*
		 * true - Drink 1, Drink 2
		 * false - Other 1, Other 2
		 */
		
		
		// groupingBy
		
		Map<LocalDate, List<Product>> groups = products.stream()
					.collect(Collectors.groupingBy(p -> p.getBestBefore()));
				
		/*
		 * date 1 - product 1
		 * date 2 - product 2, product 3
		 */
		
		
		
		// faltMapping
		
		List<Order> orders = new ArrayList<>();
		
		Customer joe = new Customer("Joe");
		Customer bob = new Customer("Bob");

		Order order1 = new Order(joe);
		Order order2 = new Order(bob);
		Order order3 = new Order(joe);
		
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		
		
		order1.setDate(LocalDate.now().plusDays(-5));

		Product tea = new Product(1, "Tea", BigDecimal.valueOf(1.99), LocalDate.now());
		Product cake = new Product(1, "Cake", BigDecimal.valueOf(2.99), LocalDate.now());
		Product coffee = new Product(1, "Coffee", BigDecimal.valueOf(1.99), LocalDate.now());

		
		order1.addItem(tea);
		order1.addItem(cake);

		order2.addItem(coffee);

		order3.addItem(coffee);
		order3.addItem(cake);

		
		Map<String, Set<Product>> customerProducts =
				orders.stream()
					.collect(Collectors.groupingBy(o -> o.getCustomer().getName(),
							Collectors.flatMapping(o -> o.getItems().stream(), Collectors.toSet())));
		
		/*
		 * {Joe = [Tea, Coffee, Cake], Bob = [Coffee]}
		 */
		
		
		// filtering
		
		Map<String, Set<Order>> customerOrdersOnDate = 
				orders.stream()
					.collect(Collectors.groupingBy(o -> o.getCustomer().getName(),
							Collectors.filtering(o -> o.getDate().equals(LocalDate.now().plusDays(-5)), 
									Collectors.toSet())));
		
		/*
		 * {Joe=[order1], Bob=[]}
		 */
	}
	
	
}
