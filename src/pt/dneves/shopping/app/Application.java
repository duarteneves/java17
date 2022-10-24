package pt.dneves.shopping.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;
import pt.dneves.shopping.app.model.Product;

public class Application {

	public static void main(String[] args) {
		
		
		Product product1 = new Product();
		
		product1.setPrice(BigDecimal.valueOf(35.0));
		
		System.out.println("Price before discount: " 
				+ product1.getPrice().doubleValue());

		
		
		Product product2 = new Product(0, "Product 1", 
				BigDecimal.valueOf(100.0), 
				LocalDate.now().plusDays(90));

		
		System.out.println("Price before discount: " 
				+ product2.getPrice().doubleValue());
		
		
		product2.applyDiscound(BigDecimal.valueOf(25));
		
		System.out.println("Price after discount: " 
				+ product2.getPrice().doubleValue());
		
	}
	
	
	public void order(Product product) {
		
		BigDecimal price = product.getPrice();
		
		BigDecimal discount = BigDecimal.ZERO;
		
		
		// set discount for Food type
		
		if(product instanceof Food) {
			
			discount = ((Food) product).getBestBefore().isEqual(LocalDate.now().plusDays(1))
						? price.multiply(BigDecimal.valueOf(0.1))
						: BigDecimal.ZERO;
			
		}
		
		
		// set discount for Drink type

		if(product instanceof Drink) {
			
			LocalTime now = LocalTime.now();
			
			discount = (now.isAfter(LocalTime.of(17, 30)) && now.isBefore(LocalTime.of(18, 30)))
						? price.multiply(BigDecimal.valueOf(0.2))
						: BigDecimal.ZERO;
			
		}
		
		price = price.subtract(discount);
		
	}
	
}
