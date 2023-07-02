/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory_card;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;


public class Game_over  extends StackPane{
    
BackgroundImage backgroundImage = new BackgroundImage(new Image("Images/game_over.jpg",600,600,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
ImageView  restart = new ImageView(new Image("Images2/restart.jpg",100,100,false,true));

public Game_over(){
    setBackground(new Background(backgroundImage));
    restart.setTranslateY(200);
    getChildren().add(restart);
    
    
}    
}
