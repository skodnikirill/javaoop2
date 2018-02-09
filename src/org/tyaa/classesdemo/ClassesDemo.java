/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.classesdemo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.tyaa.classesdemo.entity.Pixel;
import org.tyaa.classesdemo.entity.Point;

/**
 *
 * @author student
 */
public class ClassesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int z = 10;
        //System.out.println(Point.getCount());
        Point p1 = new Point();
        Point p2 = new Point(30, 40);
        //p2.toString();
        //System.out.println(Point.getCount());
        try {
            p1.setX(10);
            p1.setY(20);
        } catch (Exception ex) {
            //Logger.getLogger(ClassesDemo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } finally {
            
        }
        //System.out.println(p1.x);
        //System.out.println(p1.y);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        System.out.println();
        
        //System.out.printf("Х1 = %d; Y1 = %d\n", p1.getX(), p1.getY());
        //System.out.printf("Х2 = %d; Y2 = %d\n", p2.getX(), p2.getY());
        //p1 = null;
        
        Pixel i = new Pixel();
        
        //i.color="Chocolate";
        i.color = Pixel.Colors.White;
        
        System.out.println(i.color);
        
        Pixel pixel2 = new Pixel(60, 70);
        pixel2.color = Pixel.Colors.Chocolate;
        System.out.printf("Х1 = %d; Y1 = %d\n", pixel2.getX(), pixel2.getY());
        
        Pixel pixel3 = new Pixel(100, 10);
        
        System.out.println(Pixel.getCount());
        
        System.out.println(pixel2.toString());
        System.out.println(pixel3.toString());
        
        //demo changes
    }
    
}
