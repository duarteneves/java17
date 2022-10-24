


/**
 * @author dneves
 *
 */
public class Pessoa {

	private String nome;
	
	public String string;
	
	
	int passos;
	
	
	public Pessoa() {
		this.nome = "Guest";
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	/**
	 * descrição do metodo
	 * 
	 * inputs...
	 * 
	 * @return retornado
	 */
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void andar() {
		passos++;
	}
	
	void andar(int passos) {
		// this.p assos = this.passos + passos;
		this.passos += passos;
	}
	
}
