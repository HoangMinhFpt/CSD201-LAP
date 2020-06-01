/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author hoang minh
 */
public class Main {
    public static void main(String[] args) {
        
        Point2D d1= new Point2D(2, 3.5);
        System.out.println("A");
        d1.output();
        Point2D d2= new Point2D(5, 5.5);
        System.out.println("B");
        d2.output();
        System.out.println(d1.distance(d2));
        
    }      
}
