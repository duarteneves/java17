package pt.dneves.shopping.interfaces.model;

public class Drink implements Liquid, Consumable {

	@Override
	public String getPrepareMode() {
		return null;
	}

	@Override
	public int getQuantity() {
		return 0;
	}

}
