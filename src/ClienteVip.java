

public class ClienteVip extends Cliente {

	@Override
	public void compra(int valor) {
		pontos += valor * 2;
	}
	
}
