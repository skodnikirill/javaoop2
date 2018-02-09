/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.classesdemo.entity;

/**
 *
 * @author student
 */
public class Pixel extends Point {
    
    //public String color;
    public Colors color;
    
    private static int count;
    
    //public enum Colors { Chocolate, Black, White };
    public static enum Colors { 
        Chocolate
        , Black
        , White 
    };
    
    public Pixel(){
        super();
        count++;
    }
    
    public Pixel(int x, int y){
        //
        super(x, y);
        count++;
    }
    
    public static int getCount() {
        return count;
    }

    @Override
    public int getY() {
        
        return super.getY(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "; color = " + color;
    }
}
