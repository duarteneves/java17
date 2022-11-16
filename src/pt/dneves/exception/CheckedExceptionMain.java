package pt.dneves.exception;

import java.nio.file.NoSuchFileException;

public class CheckedExceptionMain {

	
	public static void main(String[] args) {
		
		/*
		 * Obrigatório fazer throws NoSuchFileException na assinatura do método.
		 * Obrigatório fazer try catch no âmbito da invocação do método ou throws.
		 */
		
		try {
			openFile(null);
		} catch (NoSuchFileException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void openFile(String fileName) throws NoSuchFileException {
		
		// throws IOException 
		
		if(fileName == null) {
			throw new NoSuchFileException("Filename must be set");
		}
		
		// ...
		
	}
	
}
