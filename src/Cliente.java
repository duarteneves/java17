

public class Cliente extends Pessoa {

	public int pontos;
	
	public Cliente() {
		super("Cliente");
	}
	
	public void compra(int valor) {
		
		if(valor > 100) {
			pontos += valor;
		} else {
			pontos = pontos + (valor / 2);
		}

	}
	
	void teste() {
		
		int vida = 100;
		
		while (vida > 0 
		|| vida == 0 || vida < 0) {
		vida--;
		}
		
		
		String string = "";
		
		string.concat("Ola")
			.concat(" Mundo")
			.concat("!!!");
		

	}
	
}
