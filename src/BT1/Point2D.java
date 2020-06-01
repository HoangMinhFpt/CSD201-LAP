/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.Scanner;
import static java.lang.Math.*;
/**
 *
 * @author hoang minh
 */
public class Point2D {
    double x;
    double y;
    double z;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
        
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public void output(){
        System.out.println("(" + x + ", " + y + ")");
    }
    
    public double distance(Point2D p){
        double kc= sqrt(pow((this.x-p.x),2)+pow((this.y-p.y),2));
        System.out.println("Khoang cach: ");
        return kc;
    }    
}
