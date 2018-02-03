/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
/**
 * FXML Controller class
 *
 * @author Jason
 */
public class CheckerboardFXMLController implements Initializable, Startable {
    private Stage stage;
    BoardGenerator generator;
    
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private VBox vBox;
    
    //private int defRows, defCols = 8;
    int rows = 8;
    int cols = 8;
    private final int grid1 = 16;
    private final int grid2 = 10;
    private final int grid3 = 8;
    private final int grid4 = 3;
    
    private Color light = Color.RED;
    private Color dark = Color.BLACK;

        /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
    public void start(Stage stage){
        this.stage = stage;
        anchorPane.getChildren().clear();
        //hardcoded default values, had difficulties passing the variables
        generator = new BoardGenerator(8,8, anchorPane.getWidth(), anchorPane.getHeight());
        anchorPane.getChildren().add(generator.build());
        
        ChangeListener<Number> lambdaChangeListener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
            refresh(rows, cols);
        };
        
        this.stage.widthProperty().addListener(lambdaChangeListener);
        this.stage.heightProperty().addListener(lambdaChangeListener);
        
        refresh(rows, cols);

    }
    
    private void refresh(int rows, int cols){
        anchorPane.getChildren().clear();
        
         generator = new BoardGenerator(rows, cols, anchorPane.getWidth(), anchorPane.getHeight(), light, dark);
        anchorPane.getChildren().add(generator.build());
        
    }
    
    @FXML
    private void handleGrid1(ActionEvent event){
        refresh(grid1,grid1);
        cols = grid1;
        rows = grid1;
    } 
    @FXML
    private void handleGrid2(ActionEvent event){
        refresh(grid2,grid2);
        cols = grid2;
        rows = grid2;
    } 
    @FXML
    private void handleGrid3(ActionEvent event){
        refresh(grid3,grid3);
        cols = grid3;
        rows = grid3;
    } 
    @FXML
    private void handleGrid4(ActionEvent event){
        refresh(grid4,grid4);
        cols = grid4;
        rows = grid4;
    } 
    
    @FXML
    private void handleDefault(ActionEvent event){
      colorChanger(Color.RED,Color.BLACK); 
    } 
    @FXML
    private void handleBlue(ActionEvent event){
        colorChanger(Color.SKYBLUE,Color.DARKBLUE);
    }
    
    private void colorChanger(Color lightColor, Color darkColor){
         anchorPane.getChildren().clear();
        light = lightColor;
        dark = darkColor;
         generator = new BoardGenerator(generator.getNumRows(), generator.getNumCols(), anchorPane.getWidth(), anchorPane.getHeight(), lightColor, darkColor);
        anchorPane.getChildren().add(generator.build());
        //generator.setColor(lightColor, darkColor);
    }
}
