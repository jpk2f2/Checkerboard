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
    private Color lightColor;
    private Color darkColor;
    private double rectangleWidth;
    private double rectangleHeight;
    
    
    public BoardGenerator(int numRows, int numCol, double boardWidth, double boardHeight){
        
    }
    
    public BoardGenerator(int numRows, int numCol, double boardWidth, double boardHeight, Color lightColor, Color darkColor){
        
    }
    
    public AnchorPane build(){
        
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
    
    
    
}
