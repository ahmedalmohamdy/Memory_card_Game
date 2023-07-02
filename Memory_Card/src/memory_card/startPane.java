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


public class startPane extends StackPane{
    
    BackgroundImage backgroundImage = new BackgroundImage(new Image("Images/background.jpg",600,600,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
    ImageView logo1 = new ImageView(new Image("Images/logo1.jpg"));
    ImageView logo2 = new ImageView(new Image("Images/logo2.jpg"));
    ImageView table = new ImageView(new Image("Images/table.png"));
    ImageView start = new ImageView(new Image("Images/start.png"));
    
    
    public startPane(){
    setBackground(new Background(backgroundImage));
    getChildren().addAll(start, logo1 ,logo2 , table);
    setLogo();
    setStartButton();
    
    
    }
    public void setStartButton(){
    start.setScaleX(.6);
    start.setScaleY(.6);
    start.setTranslateY(120);
    
    }
    public void setLogo(){
    logo1.setScaleX(.6);
    logo1.setScaleY(.6);
    logo1.setTranslateY(-150);
    
    logo2.setScaleX(.5);
    logo2.setScaleY(.5);
    logo2.setTranslateY(230);
    
    table.setScaleX(.6);
    table.setScaleY(.3);
    table.setTranslateY(-300);
    
    
    }
    
    
    
    
}
