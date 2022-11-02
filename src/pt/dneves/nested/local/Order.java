package pt.dneves.nested.local;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import pt.dneves.shopping.app.model.Product;

public class Order {

	private static final double DISCOUNT = 0.1;

	private Map<Integer, Item> items = new HashMap<>();
	
	public void manageTax(String saleLocation) {
		
		/**
		 * Contém lógica complexa e suficiente para que o algoritmo 
		 * seja encapsulado numa classe.
		 *
		 */
		class OrderTaxmanager {
			
			private BigDecimal findRate(Product product) {
				
				// formula com base na localização da venda (saleLocation) e no produto (product) para obter a taxa.
				
				double result = 0.0;
				
				if("PT".equals(saleLocation)) {
					result = DISCOUNT;
				}
				
				
				return BigDecimal.valueOf(result);
				
			}
			
			BigDecimal calculateTax() {
				
				// calcula a taxa dada a localização de venda para cada produto
				
				for (Item item : items.values()) {
					Product product = item.product;
					findRate(product);
				}
				
				return null;
				
			}
			
		}
		
		// instâncias da inner class apenas podem ser criadas no contexto da outer class

		OrderTaxmanager taxManager = new OrderTaxmanager();
		taxManager.calculateTax();
		
	}
	
	public void otherManageTax(String saleLocation) {

		// compile error
		
//		OrderTaxmanager taxManager = new OrderTaxmanager();
//		taxManager.calculateTax();
		
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
		
	}
	
}
