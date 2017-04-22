package model;

public class Logic {

	//Attributes
	GameState gameState = GameState.START_SCREEN;
	Avatar avatar;
	
	
	
	public Logic(){
		
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}
	
	public void startGame(){
		setGameState(GameState.RUNNING);
	}
	
	public void updateElements(double deltaSec) {
		// TODO Auto-generated method stub
		if(gameState == GameState.RUNNING ){
			avatar.update(deltaSec);
			//checkCollion();
		}
		
	}

	
}
