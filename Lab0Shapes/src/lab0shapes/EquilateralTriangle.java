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
public class EquilateralTriangle extends Shapes{
    private double sides;
    
    public EquilateralTriangle(String name)
    {
        super(name);
    }
    
    public void setDimensions(double sides) 
    {
        this.sides = sides;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("Sides length: " + this.sides);
    }
    
    @Override 
    public double getArea()
    {
        double halfper = (sides * 3) / 2;
        
        double area = Math.sqrt((halfper)*((halfper-sides)*(halfper-sides)*(halfper-sides)));
        return area;
    }
}
