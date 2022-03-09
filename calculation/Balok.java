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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    // attribute
    public double height;
    public double volumeResult;
    public double surfaceResult;
    
    Scanner input = new Scanner(System.in);
    
    // constructor  
    public Balok (double height, double length, double width){
        super(length, width);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
        
    // method
    @Override
    public void volume() {
        volumeResult = super.getLength() * super.getWidth() * getHeight();
        
    }

    @Override
    public void surface() {
        surfaceResult = 2*((super.getLength() * super.getWidth()) +(super.getLength() * getHeight()) +(super.getWidth() * getHeight()));
    }
}
