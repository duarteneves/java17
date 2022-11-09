package pt.dneves.stream;

import java.util.ArrayList;
import java.util.List;

import pt.dneves.shopping.app.model.Product;

public class Parallel {

	public static void main(String[] args) {
		
		
		List<Product> products = new ArrayList<>();
		
		// populate list
		
		double sum = products.stream().parallel()
			.mapToDouble(p -> p.getPrice().doubleValue())
			.sum();
		
		/*
		 * stateless - a obtenção do preço não afeta outros produtos
		 * non-interfering - não adicionar, atualizar ou remover produtos da lista durante o processamento
		 * associative - o preço não deve depender de outros produtos
		 */
		
		
	}
	
}
