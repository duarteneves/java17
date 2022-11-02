package pt.dneves.nested.staticz;

public class StaticNestedClassMain {

	public static void main(String[] args) {
		
		// é possível criar uma instância da classe estática
		// sem criar a instãncia da outer class
		
		Order.ShippingMode shippingMode = Order.createShippingMode("Fast");
		
		String description = shippingMode.getDescription();
		System.out.println(description);

		
		shippingMode = Order.createShippingMode("Normal");
		
		description = shippingMode.getDescription();
		System.out.println(description);
		
		
		shippingMode = new Order.ShippingMode("Super Fast");
		
		description = shippingMode.getDescription();
		System.out.println(description);
		
		
		double deliveryCost = shippingMode.getDeliveryCost();
		System.out.println(deliveryCost);
		
	}
	
}
