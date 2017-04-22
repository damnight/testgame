package model;

public class GameFactory {

	public static Logic createGame(){
		
		Logic gameModel = new Logic();
		gameModel.startGame();
		
		
		return gameModel;
	}
	
	
}
