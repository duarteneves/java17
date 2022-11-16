package pt.dneves.debug;

import java.util.HashSet;
import java.util.Set;

public class Assertions {

	
	public static void main(String[] args) {
		
		
		Set<String> values = new HashSet<>();
		
		boolean add = values.add("element");
		
		assert add: "Já existe elemento 1.";

		
		add = values.add("element");
		
		
		// ativar -ea ou -enableassertoins
		
		
		// assert <boolean expression>;
		// assert <boolean expression>: <error text expression>
		
		assert add: "Já existe elemento 2.";

		
		
		int result = 2 + 3;
		
		assert result != 5: "Resultado da soma inválido.";
		
	}
	
}
