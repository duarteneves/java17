package pt.dneves.debug;

import java.util.HashSet;
import java.util.Set;

public class Assertions {

	
	public static void main(String[] args) {
		
		
		Set<String> values = new HashSet<>();
		
		boolean add = values.add("element");
		
		
		add = values.add("element");
		
		
		// ativar -ea ou -enableassertons
		
		
		// assert <boolean expression>;
		// assert <boolean expression>: <error text expression>
		
		assert add: "Já existe elemento.";
		
	}
	
}
