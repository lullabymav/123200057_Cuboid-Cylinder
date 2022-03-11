/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

/**
 *
 * @author Lenovo
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    // attribute
    public double height;
    public double volumeResult;
    public double surfaceResult;
    
    // constructor
    public Tabung(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // method
    @Override
    public void volume() {
        volumeResult = 3.14 * Math.pow(super.getRadius(), 2) * height;
    }

    @Override
    public void surface() {
        surfaceResult = 2 * 3.14 * super.getRadius() * (super.getRadius() + height);
    }
}
