package pt.dneves.game.clazz;

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
				player.setLife(player.getLife() - ((Enemy) element).getPain());
			}
			
		}
		
		// jogador atual no final é atualizado para o jogador
		// seguinte
		
	}
	
}
