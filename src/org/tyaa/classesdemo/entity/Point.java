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
//Класс
public class Point {
    
    //public int x;
    //public int y;
    
    //Поля для объекта
    private static int count;
    //private static int count = 0;
    
    /*static {
        count = 0;
    }*/

    public static int getCount() {
        return count;
    }
    
    //Констркутор без параметров
    public Point(){
        
        count++;
        //то же самое, что:
        //count = count + 1;
        //то же самое, что:
        //count += 1;
    }
    
    public Point(int x, int y){
        this.x=x;
        this.y=y;
        count++;
        //то же самое, что:
        //count = count + 1;
        //то же самое, что:
        //count += 1;
    }
    
    //Поля для экземпляров
    private int x;
    private int y;

    //Метод чтения значения из поля экземпляров
    public int getX() {
        return x;
    }

    public void setX(int x) throws Exception {
        if (x < 0) {
            throw new Exception("Х должен быть больше 0");
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
