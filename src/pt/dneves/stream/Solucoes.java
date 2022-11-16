package pt.dneves.stream;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import pt.dneves.shopping.app.model.Customer;
import pt.dneves.shopping.app.model.Order;
import pt.dneves.shopping.app.model.Product;


public class Solucoes {

	
	public static void main(String[] args) {
		
		
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

		
		
		// Exercicio 1
		
		exercicio1(orders);

		
		// Exercicio 2
		
		exercicio2(orders);

		
		// Exercicio 3
		
		exercicio3(orders, "Joe");

		
		// Exercicio 4
		
		exercicio4(order1);

		
		// Exercicio 5
		
		exercicio5(orders);
		
	}


	private static List<Customer> exercicio1(List<Order> orders) {
		
		
		List<Customer> customers = orders.stream()
			.map(o -> o.getCustomer())
			.collect(Collectors.toList());
		
		
		customers
			.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
		
		
		return customers;
		
	}
	
	
	private static List<Customer> exercicio2(List<Order> orders) {
		
		
		List<Customer> customers = orders.stream()
				.map(o -> o.getCustomer())
				.filter(c -> c.getName().charAt(0) == 'B')
				.collect(Collectors.toList());
			
			
		customers
			.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
		
		
		return customers;
		
	}	

	
	private static Customer exercicio3(List<Order> orders, String name) {
		
		return orders.stream()
				.map(o -> o.getCustomer())
				.filter(c -> c.getName().equals(name))
				.findFirst()
				.orElse(null);

	}
	
	private static double exercicio4(Order order) {

		return order.getItems().stream()
			.mapToDouble(p -> p.getPrice().doubleValue())
			.sum();
		
	}

	private static Order exercicio5(List<Order> orders) {
		
		return orders.stream()
				.max(Comparator.comparing(o -> Solucoes.exercicio4(o)))
				.get();
		
	}

	
}
