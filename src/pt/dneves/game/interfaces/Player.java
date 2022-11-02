package pt.dneves.game.interfaces;

public class Player extends Element {

	private int life;
	
	private int square;
	
	private boolean isShield;
	
	
	public int getLife() {
		return life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getSquare() {
		return square;
	}
	
	public void setSquare(int square) {
		this.square = square;
	}
	
	public boolean isShield() {
		return isShield;
	}
	
}
