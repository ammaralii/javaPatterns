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
public class Circle extends Shape {
    
     private double radius;
    final double pi = Math.PI;
    private int x;
    private int y;
    private Color color;
    
   public Circle()
   {
        this.x = super.getX();
        this.y = super.getY();
        this.radius = 0;
        this.color = null;
   }
   
    public Circle(double radius)
   {
       
        this.radius = radius;
        this.color = null;
   }
   
    
    public Circle(double radius,Color c)
   {
       
        this.radius = radius;
        this.color = c;
   }
   
   
   public Circle(int x , int y , int radius , Color c)
   {
         this.x = super.getX();
        this.y = super.getY();
        this.radius = radius;
        this.color = c;
       
   }
  
    public Circle(int x,int y,int radius) {
      
       this.x = super.getX();
        this.y = super.getY();
        this.radius = radius;
    
     }
    
   
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public int getRadius()
    {
        return (int) radius;
    }
    
    public void setRadius(double newRadius)
    {
        this.radius = newRadius;
    }
    
     @Override
    public String toString( )
    {
          return "Circle[radius="+radius+",Perimater="+perimeter()+",area="+area()+"]";
    }

  

    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        // P = 2πr
        return 2 * pi * radius;
    }
    
     @Override
    public void paintComponent(Graphics g){
     super.paintComponent(g);
      //  setBounds(10, 20, 2 * getRadius(),  2 * getRadius()); 
     g.drawLine(0,0,1140,850);
      g.setColor(color); 
     g.fillOval(x ,y, 2 * getRadius(), 2 * getRadius());
    // g.drawOval(x,y, 2 * getRadius(), 2 * getRadius());
    
    }
 
    
}
