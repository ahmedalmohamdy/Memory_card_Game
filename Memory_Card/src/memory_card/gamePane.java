/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory_card;

import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;


public class gamePane extends StackPane {
int btn = 0 ;
int flag = 0 ;
int image1;
int image2;
int seconds=0 ;
int move =0 ;
int answer=0 ;

BackgroundImage backgroundImage = new BackgroundImage(new Image("Images/background.jpg",600,600,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
BackgroundImage pic1 = new BackgroundImage(new Image("Images/pic1.jpg",100,100,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
BackgroundImage pic2 = new BackgroundImage(new Image("Images/pic2.jpg",100,100,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
BackgroundImage pic3 = new BackgroundImage(new Image("Images/pic3.jpg",100,100,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
BackgroundImage pic4 = new BackgroundImage(new Image("Images/pic4.jpg",100,100,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
BackgroundImage pic5 = new BackgroundImage(new Image("Images/pic5.jpg",100,100,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
BackgroundImage pic6 = new BackgroundImage(new Image("Images/pic6.jpg",100,100,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
BackgroundImage pic7 = new BackgroundImage(new Image("Images/pic7.jpg",100,100,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
BackgroundImage pic8 = new BackgroundImage(new Image("Images/pic8.jpg",100,100,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
BackgroundImage fan = new BackgroundImage(new Image("Images/fan.jpg",100,100,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
ImageView table = new ImageView(new Image("Images/table.png"));
RotateTransition rotateTransition1 = new RotateTransition();
RotateTransition rotateTransition2 = new RotateTransition();



GridPane grid = new GridPane();
Button next = new Button("<< Next");
HBox hbox = new HBox(10);
Label Try = new Label("Try:");
Label time = new Label("Time:");
TextField t_move = new TextField();
TextField t_time = new TextField();
Label correctanswer = new Label("Correct Answer");
TextField t_correctanswer = new TextField();
Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e-> {
                seconds++;
                t_time.setText(String.valueOf(seconds));
}));


BackgroundImage [] image = {pic1,pic3,pic5,pic6,pic7,pic5,pic2,pic4,pic6,pic2,pic7,pic4,pic3,pic1,pic8,pic8};
Button [] button = new Button[16];
 

public gamePane(){
            setBackground(new Background(backgroundImage));
            generateButton();
            getChildren().addAll(table,hbox , grid );
            buildGrid();
            setTime_moves();
            
            
}
public void buildGrid(){
            grid.setHgap(50);
            grid.setVgap(30);
            setPadding(new Insets(90,10,10,10));
            for(int i=0; i<=3; i++){
            for(int j=0; j<=3; j++){
            button[btn].setMinSize(100, 100);
            grid.add(button[btn], i, j);
            btn+=1;
}
}
            table.setScaleX(.6);
            table.setScaleY(.3);
            table.setTranslateY(-340);
    
}

    
public void generateButton() {
            for (int i = 0; i < 16; i++) {
            Button currentButton = new Button();  
            button[i] = currentButton;
            final int buttonIndex = i; 
            button[buttonIndex].setBackground(new Background(fan));
            currentButton.setOnAction(e -> {
            button[buttonIndex].setBackground(new Background(image[buttonIndex]));
            if(flag==0){
            flag=1;
            image1= buttonIndex;
}
            else  {image2=buttonIndex;  
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
            @Override
            public void run() {
            check(); flag=0; 
            move+=1;
            t_move.setText(String.valueOf(move));
            timer.cancel(); }}   , 500); }          // delay for function check()
            
});
}
}

public  void check(){
            if(((image1==15&image2==14)||(image1==14&image2==15))||((image1==13&image2==0)||(image1==0&image2==13))||((image1==4&image2==10)||(image1==10&image2==4))||((image1==3&image2==8)||(image1==8&image2==3))||((image1==2&image2==5)||(image1==5&image2==2))||((image1==7&image2==11)||(image1==11&image2==7))||((image1==12&image2==1)||(image1==1&image2==12))||((image1==6&image2==9)||(image1==9&image2==6))){
            button[image1].setDisable(true);
            button[image2].setDisable(true);
            answer+=1 ;
            t_correctanswer.setText(String.valueOf(answer));
 }
            else {  button[image1].setBackground(new Background(fan));
                    button[image2].setBackground(new Background(fan)); 
                    animation1(image1);
                    animation2(image2);
                    rotateTransition1.play();
                    rotateTransition2.play();
            }
}
public void setTime_moves(){
            next.setTextFill(Color.BROWN);
            Try.setTextFill(Color.WHITE);
            time.setTextFill(Color.WHITE);
            correctanswer.setTextFill(Color.WHITE);
            Try.setFont(new Font("Arial", 20));
            time.setFont(new Font("Arial", 20));
            correctanswer.setFont(new Font("Arial", 20));
            t_move.setEditable(false);
            t_move.setText("0");
            t_move.setPrefColumnCount(5);
            t_time.setEditable(false);
            t_time.setText("0");
            t_time.setPrefColumnCount(5);
            t_correctanswer.setEditable(false);
            t_correctanswer.setText("0");
            t_correctanswer.setPrefColumnCount(5);
            hbox.getChildren().addAll(next ,Try , t_move ,time ,t_time ,correctanswer , t_correctanswer);
            hbox.setTranslateY(-80);
            hbox.setMinSize(100, 10);
}
public void animation1(int x ){
            rotateTransition1.setNode(button[x]);
            rotateTransition1.setDuration(Duration.seconds(0.4));
            rotateTransition1.setByAngle(360);
}
public void animation2(int x ){
            rotateTransition2.setNode(button[x]);
            rotateTransition2.setDuration(Duration.seconds(0.4));
            rotateTransition2.setByAngle(360);
}

}


