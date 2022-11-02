package pt.dneves.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pt.dneves.shopping.app.model.Product;

public class LambdaMain {

	
	public static void main(String[] args) {
		
		List<Product> products = null;
		
		Collections.sort(products, 
				(o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		
		
		// {} e return são opcionais quando o body tem apenas uma linha.

		List<String> names = new ArrayList<>();
		
		names.sort((s1, s2) -> {
			return s1.compareTo(s2);
		});

		names.sort((s1, s2) -> s1.compareTo(s2));

		
		
		// () nos parâmetros são opcionais quando temos apenas um
		
		names.removeIf( s1 -> s1.equals("string"));
		names.removeIf( (s1) -> s1.equals("string"));
		
		
		// o tipo é tb opcional
		
		names.removeIf( (String s1) -> s1.equals("string"));

		
		// pode usar-se var
		
		names.removeIf( (var s1) -> s1.equals("string"));

		
		// pode aplicar-se final
		
		names.removeIf( (final String s1) -> s1.equals("string"));
		// names.removeIf( (final String s1) -> {s1 = ""; return s1.equals("string");});
		
		
		// pode definir-se uma interface com expressão lambda e reutilizá-la
		
		Comparator<String> sort = (s1, s2) -> s1.compareTo(s2);
		
		Collections.sort(names, sort);

		
	}
	
}
