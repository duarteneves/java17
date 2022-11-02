package pt.dneves.game.interfaces;

public class PlayerTypeShield extends Player implements Shield {

	@Override
	public int protect(int pain) {
		return pain / 2;
	}
	
}
