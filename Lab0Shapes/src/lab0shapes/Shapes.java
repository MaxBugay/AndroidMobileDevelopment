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
public class Shapes {
    private String name;
    
    public Shapes(String name) { 
        this.name = name; 
    }
    
    /** returns the name of the shape */ 
    public String getName() { 
        return name; 
    }
    
    /** returns the area of the shape */ 
    public double getArea() { 
        return 0.0; 
    }
    
    public void printDimensions(){ 
        System.out.println("No dimensions");
    }
}
