package pt.dneves.stream;

import java.util.ArrayList;
import java.util.List;

import pt.dneves.shopping.app.model.Order;

public class StreamPerformanceFlatMap {

	
	public static void main(String[] args) {
		
		
		List<Order> orders = new ArrayList<>();
		
		
		// o valor total de todos os chás vendidos
		
		double sum = orders.stream()
				.flatMap(order -> order.getItems().stream())
				.filter(item -> item.getName().equals("Tea"))
				.mapToDouble(item -> item.getPrice().doubleValue())
				.sum();
		
	}
	
}
