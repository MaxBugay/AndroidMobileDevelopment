/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0shapes;

/**
 *
 * @author MaxBu
 */
public class Triangle extends Shapes{
    private double side1, side2, side3;
    
    public Triangle(String name)
    {
        super(name);
    }
    
    public void setDimensions(double side1, double side2, double side3) 
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("Side 1 length: " + this.side1);
        System.out.println("Side 2 length: " + this.side2);
        System.out.println("Side 3 length: " + this.side3);
    }
    
    @Override 
    public double getArea()
    {
        double halfper = (side1 + side2 + side3) / 2;
        double area = Math.sqrt((halfper)*((halfper-side1)*(halfper-side2)*(halfper-side3)));
        return area;
    }
}
