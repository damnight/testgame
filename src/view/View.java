package view;


import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Logic;


public class View  {
	
	//Attributes
	Scene mainGameAreaCanvas;
	private GraphicsContext mainGameAreaGraphicsContext;
	
	
	
	
	//Constructor
     public View(Stage stage) {
        
    	Group root = new Group();
    	Scene scene = new Scene(root);

    	Rectangle r = new Rectangle(25,25,60,100);
    	r.setFill(Color.BLACK);
    	
    	

    	root.getChildren().add(r);
      
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

     
     
     
     //Methods
     public void renderGameModel(Logic gameModel) {
 		
 		/*
 		 * The order of these five calls matters: whatever is drawn first (in this case
 		 * the background) will be displayed at the lowest layer. Something that is 
 		 * drawn after that will be above the previous drawing. For example, if the
 		 * background was drawn last instead of first, it would be on top of the rest,
 		 * the lander, obstacles, etc. would be behind the background and thus not visible.
 		 */
 		drawBackground();
 		
 		// first set every dialog invisible
 	
 		
 		// enable visibilties of the dialogs based on the current GameState
 		
 		}
 		
 		// set the volume of the engine sound based on the thrust percentage
 		// or mute it when the game is paused
 		
 		private void drawBackground(){
 			
			mainGameAreaGraphicsContext.clearRect(0, 0, mainGameAreaCanvas.getWidth(), mainGameAreaCanvas.getHeight());
 		}
 		

 	}
