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
public class Square extends Shapes{
    private double length, height;
    
    public Square(String name)
    {
        super(name);
    }
    
    public void setDimensions(double length, double height) 
    {
        this.length = length;
        this.height = height;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("Length: " + this.length);
        System.out.println("Height: " + this.height);
    }
    
    @Override 
    public double getArea()
    {
        double area = length * height;
        return area;
    }
}
