/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Lingkaran implements MenghitungBidang{
    // attribute
    public double radius;
    public double areaResult;
    public double circumResult;
    
    // constructor
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    // method
    @Override
    public void area() {
        areaResult = 3.14 * Math.pow(radius, 2) ;
    }

    @Override
    public void circumference() {
        circumResult = 2 * 3.14 * radius;
    }
    
}
