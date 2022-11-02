package pt.dneves.game.interfaces;

public class PlayerPolice implements Gun, Taser {

	@Override
	public int strong() {
		return 20;
	}

	@Override
	public int volts() {
		return 50000;
	}

	@Override
	public int frozen() {
		return 15;
	}

}
