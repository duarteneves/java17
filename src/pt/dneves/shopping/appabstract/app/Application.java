package pt.dneves.shopping.appabstract.app;

import java.math.BigDecimal;

import pt.dneves.shopping.appabstract.model.Car;
import pt.dneves.shopping.appabstract.model.Product;
import pt.dneves.shopping.appabstract.model.Tech;

public class Application {

	
	public static void main(String[] args) {
		
		
		Product car = new Car(1, "car", BigDecimal.valueOf(19999), 2004, 120000);
		
		System.out.println(car.getState());

		
		
		Product tech = new Tech(2, "tech", BigDecimal.valueOf(299), "Novo");
		
		System.out.println(tech.getState());
		
	}
	
}
