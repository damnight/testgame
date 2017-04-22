package main;

import controller.Controller;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import model.GameFactory;
import model.Logic;
import view.View;

public class applicationMain extends Application{


	private static View gameView;
	private static Logic gameModel;

	
	private long lastNanoTime;

	@Override
	public void start(Stage stage) {
		
		gameView = new View(stage);
		AnimationTimer gameLoop = new AnimationTimer(){
			public void handle(long currentNanoTime) {
		
				double deltaSec = (currentNanoTime - lastNanoTime) / 1000000000.0;
				lastNanoTime = currentNanoTime;
			
				// update the game model
				gameModel.updateElements(deltaSec);
			
				// render the current (updated) model
				gameView.renderGameModel(gameModel);
			}	
		};
		
	}
	
	/**
	 * resets the game so the user can play again
	 */
	public static void resetGame() {
		gameModel = GameFactory.createGame();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
