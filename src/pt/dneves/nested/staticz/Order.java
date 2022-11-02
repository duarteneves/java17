package pt.dneves.nested.staticz;

public class Order {

	private static final double COMMISSION = 20.0;
	
	public static ShippingMode createShippingMode(String description) {
		return new ShippingMode(description);
	}

	public static class ShippingMode {
		
		private String description;
		
		public ShippingMode(String description) {
			this.description = description;
		}
		
		public String getDescription() {
			return description;
		}
		
		public double getDeliveryCost() {
			
			if("Super Fast".equals(description)) {
				
				// acesso a atributos e métodos private da outer class
				// acesso apenas a variáveis e métodos estáticos da outer class
				
				return COMMISSION;
				
			}

			if("Fast".equals(description)) {
				return COMMISSION * 0.4;
			}
			
			
			return 0;
			
		}		
		
	}
	
}
