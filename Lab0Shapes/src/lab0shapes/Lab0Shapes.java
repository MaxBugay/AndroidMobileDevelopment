/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0shapes;

import java.util.Scanner;

/**
 *
 * @author MaxBu
 */
public class Lab0Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Square inputs
        System.out.println("What is the length of the square?");
        double sqlength = input.nextDouble();
        System.out.println("What is the height of the square?");
        double sqheight = input.nextDouble();
        
        //Square outputs
        Square square = new Square("Square");
        square.setDimensions(sqlength, sqheight);
        square.printDimensions();
        System.out.println("Area of Square: " + square.getArea());
        
        //Circle inputs
        System.out.println("What is the radius of the circle?");
        double ciradius = input.nextDouble();
        
        //Circle outputs
        Circle circle = new Circle("Circle");
        circle.setDimensions(ciradius);
        circle.printDimensions();
        System.out.println("Area of Circle: " + circle.getArea());
        
        //Triange inputs
        System.out.println("What is the length of the first side on the triangle?");
        double triside1 = input.nextDouble();
        System.out.println("What is the length of the second side on the triangle?");
        double triside2 = input.nextDouble();
        System.out.println("What is the length of the third side on the triangle?");
        double triside3 = input.nextDouble();
        
        //Triangle outputs
        Triangle triangle = new Triangle("Triangle");
        triangle.setDimensions(triside1, triside2, triside3);
        triangle.printDimensions();
        System.out.println("Area of Triangle: " + triangle.getArea());
        
        //Equalateral Triangle inputs
        System.out.println("What is the length of each side on the equilateral triangle?");
        double equtrisides = input.nextDouble();
        
        //Equalateral Triangle outputs
        EquilateralTriangle EquTriangle = new EquilateralTriangle("Equilateral Triangle");
        EquTriangle.setDimensions(equtrisides);
        EquTriangle.printDimensions();
        System.out.println("Area of Equilateral Triangle: " + EquTriangle.getArea());
                
        System.out.println("Max Bugay");
    }
    
}
