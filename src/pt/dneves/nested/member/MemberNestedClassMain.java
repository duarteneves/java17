package pt.dneves.nested.member;

import pt.dneves.shopping.app.model.Drink;
import pt.dneves.shopping.app.model.Food;

public class MemberNestedClassMain {

	public static void main(String[] args) {
		
		// para criar uma instância da inner class
		// é obrigatório criar uma instância da outer class

		Order order = new Order();
		
		order.addItem(new Drink("Tea"), 1);
		order.addItem(new Food("Cake"), 2);
		
		
//		Item item = null;
//		Item item = new Item(null, 0);
		
	}
	
}
