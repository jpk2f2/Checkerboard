/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.AnchorPane;



/**
 *
 * @author Jason
 */
public class BoardGenerator {
    
    private AnchorPane anchorPane = new AnchorPane();
    
    private int numRows;
    private int numCols;
    private double boardHeight;
    private double boardWidth;
    private Color lightColor = Color.RED;
    private Color darkColor = Color.BLACK;
    private double rectangleWidth;
    private double rectangleHeight;
    
    
    public BoardGenerator(int numRows, int numCol, double boardWidth, double boardHeight){
        this.numRows = numRows;
        this.numCols = numCol;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }
    
    public BoardGenerator(int numRows, int numCol, double boardWidth, double boardHeight, Color lightColor, Color darkColor){
        this(numRows, numCol,boardWidth,boardHeight); //moved to top due to error
        this.lightColor = lightColor;
        this.darkColor = darkColor;
        
    }
    
    public AnchorPane build(){
        clear();
        rectangleWidth = Math.ceil(boardWidth / (double)numCols);
        rectangleHeight = Math.ceil(boardHeight / (double)numRows); 
        Color temp;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
        
                temp = ((i%2)==(j%2)) ? lightColor : darkColor; //switched to ternary cause it's prettier
                Rectangle box = new Rectangle(rectangleWidth,rectangleHeight,temp);
                box.setX(rectangleWidth * j);
                box.setY(rectangleHeight * i);
                anchorPane.getChildren().add(box);
            }
        }        
        return GetBoard();        
    
    }
    
    public void clear(){
        anchorPane.getChildren().clear();
    }
    public AnchorPane GetBoard(){
        if(anchorPane != null)
               return anchorPane;
        return null;   
    }
    
    public int getNumRows(){
        return numRows;
    }
    
    public int getNumCols(){
       return numCols;
    }
    
    public double getWidth(){
        return boardWidth;
    }
    
    public double getHeight(){
        return boardHeight;
    }
    
    public Color getLightColor(){
        return lightColor;
    }
    
    public Color getDarkColor(){
        return darkColor;
    }
    
    public double getRectangleWidth(){
        return rectangleWidth;
    }
    
    public double getRectangleHeight(){
        return rectangleHeight;
    }
    //unused
    /*
    public void setColor(Color light, Color dark){
        lightColor = light;
        darkColor = dark;
    }
    */
    
    
    
    
}
