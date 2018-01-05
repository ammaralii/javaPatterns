/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise3;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Sohail
 */
public class Triangle extends Shape{
    private double sideA;
    
    private double sideB;
    
    private double sideC;
    
   
    
  public Triangle()
  {
      sideA = sideB = sideC = 0;
   
  }
  
  public Triangle (double a, double b, double c) { // constructor 
    sideA = a;
    sideB = b;
    sideC = c; 
  }  
  
  
 
  //isoceles
  public Triangle(double a , double c)
  {
      sideA = sideB = a;
      
      sideC = c;
  }
  
  //if all sides are equal 
  public Triangle(double a)
  {
      sideA = sideB = sideC = a;
  }
  public boolean isTriangle () { 
    double max = Math.max(Math.max(sideA, sideB), sideC); 
    return sideA > 0 && sideB > 0 && sideC > 0 &&
           (max < sideA + sideB + sideC - max); 
  }
  
   public double getAngleC()
   {
    double oc = sideC / 2;
    double angleC = Math.toDegrees(Math.acos(oc/sideA)); 
    return angleC;
   }
   
   public double getAngleB()
   {
    double ob = sideC / 2;
    double angleB = Math.toDegrees(Math.acos(ob/sideB)); 
    return angleB;
   }
   
   public double getAngleA()
   {
        double angleA = 180 - (getAngleB() + getAngleC());
        return angleA;
   }
  
    public double area() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    
      public double perimeter() {
        // P = a + b + c
        return sideA+ sideB + sideC;
    }
      
    @Override
     public String toString()
    {
        return " Triangle  : ";
          //     + "sideA(" + vertexA.X() + "," + vertexA.Y() + "), "
            //   + "B(" + vertexB.X() + "," + vertexB.Y() + "), "
              // + "C(" + vertexC.X() + "," + vertexC.Y() + ").";
    }
    
     public double getSideA()
     {
        return sideA;
     }
    
     public double getSideB()
     {
         return sideB;
     }
     
     public double getSideC()
     {
         return sideC;
     }
     
 
   
     @Override
    public void paintComponent(Graphics g){
     
        super.paintComponent(g);
    
        g.drawLine(0,0,1140,850);
     
        g.setColor(Color.black);
       
   //  g.drawPolygon(sideA, sideB, sideC);
   
     
        double p2Y =  85+ Math.sqrt((sideA * sideA) - ((sideC / 2)* (sideC / 2)) );
        double p2X =  114 - (sideC/2);
        double p3X  =  114 + (sideC/2);
        
           int [] x= {114,(int) p2X,(int) p3X};
           int [] y={85,(int) p2Y,(int) p2Y};
           
     
     g.drawString("A", 111, 87);
     
     g.drawString("Side length A, B , C are "+ Math.round(sideA) + ",\t" + Math.round(sideB) + "," + Math.round(sideC), (int) p2X + 100 , 90);
     
     g.drawString("Vertex angle A, B , C are "+ Math.round(getAngleA()) + "," + Math.round(getAngleB()) + "," + Math.round(getAngleC()),(int) p2X + 100  , 110);
     
     g.drawString("Perismert is : " + Math.round(perimeter()),(int) p2X + 130,130);
     
     g.drawString("Area is : " + Math.round(area()),(int) p2X + 140,150);
     
    
  
            g.drawString("B",(int) p2X ,(int) p2Y +12);
     
            g.drawString("C",(int) p3X ,(int) p2Y +12);
          
            g.drawPolygon(x, y, 3);
            
            g.setColor(super.getColor());
            
            g.fillPolygon(x, y, 3);
    } 
     
    
}
