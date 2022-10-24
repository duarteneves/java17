package pt.dneves.shopping.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Shipping implements Tecnical, Review {

	private List<Product> products;
	
	public Shipping() {
		this.products = new ArrayList<>();
	}

	@Override
	public void reviews() {

		for (Product product : products) {
			
			if(product instanceof Car) {
				((Car) product).reviews();
			}
			
			if(product instanceof Tech) {
				((Tech) product).reviews();
			}
			
		}
		
	}

	@Override
	public void tecnical() {

		for (Product product : products) {
			
			if(product instanceof Car) {
				((Car) product).tecnical();
			}
			
			if(product instanceof Tech) {
				((Tech) product).tecnical();
			}
			
		}
		
	}
	
}
