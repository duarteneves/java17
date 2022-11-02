package pt.dneves.game.interfaces;

public class PlayerCitizen implements IPlayer, Taser {

	@Override
	public int volts() {
		return 20000;
	}

	@Override
	public int frozen() {
		return 5;
	}

}
