/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Sohail
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JFrame f = new JFrame("Shape");
        
        f.setSize(900, 700);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setResizable(false);
     
       //Creating circle with center point defined in shape one way
         // You can define the center point by calling setter 
        //Shape c = new Shape();
        //c.setX(10);
        //c.setY(20);
         Scanner input = new Scanner(System.in);
         
                  
         
         double radius;
         
         double sideA, sideB, sideC;
         
         int triangleChoice;
         
        System.out.println("Press 1 for draw Circle");
        System.out.println("Press 2 for draw Triangle");
        int choice = input.nextInt();
        switch(choice)
        {
            case 1 :
         System.out.println("Please Enter the radius of circle");
         radius = input.nextDouble();
         Shape s = new Shape();
         s.setX(300);
         s.setY(200);
         //and circle radius to draw the circle
         s = new Circle(radius,Color.YELLOW);//circle also have parameter to draw with color s = new Circle(59,Color.yellow);
         f.add(s);
         
         break;
         
            case 2:
                 System.out.println("Press 1 to Enter Three Side of Triangle");
                 System.out.println("Press 2 to Enter two Side of Triangle. Two side equal");
                 System.out.println("Press 3 to Enter one Side of Triangle. All sides equal");
                 triangleChoice = input.nextInt();
                 switch(triangleChoice)
                 {
                     
                     case 1:
            //  Shape traingle = new Triangle(100,100,140.421);  
                
                 System.out.println("Please Enter the value of side A");
                 sideA = input.nextDouble();
                 System.out.println("Enter the value of side B");
                 sideB = input.nextDouble();
                   System.out.println("Enter the value of side c");
                 sideC = input.nextDouble();
                 Shape traingle = new Shape();
                 traingle  = new Triangle(sideA,sideB,sideC);
               
                 //can set color by setting color

                 traingle.setColor(Color.yellow);

                 f.add(traingle);
                 
                    break;
                    
                     case 2:
                         
                           System.out.println("Please Enter the value of side A");
                            sideA = input.nextDouble();
                           
                              System.out.println("Enter the value of side c");
                            sideC = input.nextDouble();
                    
                            traingle  = new Triangle(sideA,sideC);
                             traingle.setColor(Color.yellow);

                          f.add(traingle);
                         
                     break;
                     
                     case 3:
                          System.out.println("Please Enter the value of one side ");
                            sideA = input.nextDouble();
                     
                    
                            traingle  = new Triangle(sideA);
                            
                             traingle.setColor(Color.yellow);

                            f.add(traingle);
                         
                       break;
                       
                       default:
                
                     System.out.println("Wrong");
                     break;

                         

               //  f.add(traingle2);
                 }
              break;
              
            default:
                
                System.out.println("Wrong");
                break;

                
        
        }
       
        
      
 
       
    
       f.setVisible(true);
   
      //   System.out.println(t.getAngleB());
    }
    
}
