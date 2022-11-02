package pt.dneves.nested.member;

import java.util.HashSet;
import java.util.Set;

import pt.dneves.shopping.app.model.Product;

public class Order {

	private static final double DISCOUNT = 0.1;

	private Set<Item> items = new HashSet<>();
	
	public void addItem(Product product, int quantity) {
		items.add(new Item(product, quantity));
	}
	
	class Item {
		
		private Product product;
		private int quantity;
		
		public Item(Product product, int quantity) {
			this.product = product;
			this.quantity = quantity;
		}
		
		public Product getProduct() {
			return product;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public double discount() {
			
			// possível aceder a variáveis e métodos privados da outer class
			// pode aceder tanto a vairáveis e métodos estáticos 
			// como não estáticos da outer class
			
			return quantity > 10 ? DISCOUNT : 0;
			
		}
		
	}
	
}
