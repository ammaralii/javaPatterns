/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Sohail
 */
 public class Shape extends JPanel {
         private int  x;
    
        private int  y;
   
        private Color color;
        
        
    
    public Shape()
    {
       
      this.x  = this.y = 0;
    }
        
    public Shape(int x , int y)
    {
        this.x = x;
        this.y = y;
    }
   

    @Override
    public int getX()
    {
        return x;
    }
    
    @Override
    public int getY()
    {
      return y;
    }
    
    public Color getColor()
    {
      return color;
    }
    
    public void setX(int x)
    {
     this.x = x;
    }
    
    public void setY(int y)
    {
     this.y = y;
    }
    
    public void setColor(Color color)
    {
     this.color = color;
    }
    
         @Override
    public String toString( )
    {
        return "Shape[x="+x+",y="+y+",color="+color+"]";
    }


      
         @Override
    public void paintComponent(Graphics g){
         super.paintComponent(g);
        
         
  
        }
    
    
  }
