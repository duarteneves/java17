package pt.dneves.exception;

public class UncheckedExceptionMain {

	
	public static void main(String[] args) {
		
		/*
		 * A exceção não é intercetada.
		 * O método que causa a exceção é interrompido.
		 * O programa termina a sua execução.
		 * A informação sobre a exeção é apresentada na consola.
		 * O stack trace da execeção mostra onde surgiu e a sua propagação.
		 */

		int x = 5;
		int y = 0;
		
//		int z = divide(x, y);
//		
//		System.out.println(z);
		
		
		/*
		 * Especificar mensagem de erro.
		 * Lançar a mesma exceção mas com uma mensagem personalizada.
		 * 
		 * O programa pode apanhar esta exceção, mas não deve por se tratar
		 * de uma unchecked exception.
		 * 
		 */
		
		divide_throw(x, y);
		
	}
	
	
	public static int divide(int x, int y) {
		int z = x / y;
		return z;
	}

	public static int divide_throw(int x, int y) {
		
		if(y == 0) {
			throw new ArithmeticException("Não são permitidas divisões por 0.");
		}
		
		int z = x / y;
		
		return z;
		
	}

	public static int divide_fixed(int x, int y) {
		
		if(y == 0) {
			return -1;
		}
		
		int z = x / y;
		
		return z;
		
	}
	
}
