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
public class Circle extends Shapes{
    private double radius;
    
    public Circle(String name)
    {
        super(name);
    }
    
    public void setDimensions(double radius) 
    {
        this.radius = radius;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("Radius length: " + this.radius);
    }
    
    @Override 
    public double getArea()
    {
        double area = Math.PI * (radius * radius);
        return area;
    }
}
