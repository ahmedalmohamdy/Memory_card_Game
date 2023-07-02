/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package memory_card;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Memory_Card extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        startPane start = new startPane();
        gamePane game = new gamePane();
        gamePane2 game2 = new gamePane2();
        Game_over gameover = new Game_over();
        
        
        Scene scene1 = new Scene(start,600,600);
        Scene scene2 = new Scene(game,600,600);
        Scene scene3 = new Scene(game2,600,600);
        Scene scene4 = new Scene(gameover,600,600);
        
        primaryStage.setTitle("Memory Card!");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
        start.start.setOnMouseClicked(e-> {
        primaryStage.setScene(scene2) ;
        game.timeline.setCycleCount(Timeline.INDEFINITE);
        game.timeline.play();
        });
        
        game.next.setOnAction(e-> {
        primaryStage.setScene(scene3);  
        game2.timeline.setCycleCount(Timeline.INDEFINITE);
        game2.timeline.play();
        });
        game2.next.setOnAction(e-> {
        primaryStage.setScene(scene4) ;
        });
        gameover.restart.setOnMouseClicked(e->{
        primaryStage.setScene(scene1);
       
    });
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
