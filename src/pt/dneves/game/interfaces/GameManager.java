package pt.dneves.game.interfaces;

public class GameManager {

	private Square[] squares;
	
	private Player[] players;
	
	private Enemy[] enemies;
	
	
	private Player player;
	
	
	public GameManager(int nrSquares, int nrPlayers, int nrEnemies) {
		squares = new Square[nrSquares];
		players = new Player[nrPlayers];
		enemies = new Enemy[nrEnemies];
	}
	
	public Square[] getSquares() {
		return squares;
	}
	
	public void move(int nrSquares) {
		
		player.setSquare(player.getSquare() + nrSquares);
		
		Square square = squares[player.getSquare()];
		
		
		Element[] elements = square.getElements();
		
		for (Element element : elements) {
			
			if(element instanceof Life) {
				player.setLife(player.getLife() + ((Life) element).getLife());
			}
			
			if(element instanceof Enemy) {
				
//				if(player.isShield()) {
//					player.setLife(player.getLife() - (((Enemy) element).getPain() / 2));
//				} else {
//					player.setLife(player.getLife() - ((Enemy) element).getPain());
//				}
				
				Enemy enemy = (Enemy) element;
				
				if(player instanceof PlayerTypeShield) {
					
					PlayerTypeShield playerTypeShield = (PlayerTypeShield) player;
					int protect = playerTypeShield.protect(enemy.getPain());
					
					player.setLife(player.getLife() - protect);
					
				} else {
					player.setLife(player.getLife() - enemy.getPain());
				}
				
			}
			
		}
		
	}
	
}
