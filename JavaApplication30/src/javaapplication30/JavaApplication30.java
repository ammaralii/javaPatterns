/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.Scanner;

/**
 *
 * @author Sohail
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        
     int num1;
     int num2;
     int num3;
     int num4;
     
     num1 = 30;
     num2 = 30;
     num3= 50;
     num4 = 40;
     
     if(num1==num2)
     {
         System.out.println("num1 == num2 ");
         if(num3>num4)
         {
             System.out.println("num3 greatest");
             System.out.println("num4 smallest");
         }
      
     }
     else if(num1 == num3)
     {
         System.out.println("num1 == num3 ");
     }
     else if(num1 == num4)
     {
         System.out.println("num1 == num4 ");
     }
     else if(num2 == num1)
     {
     System.out.println("num2 == num1 ");
     }
     else if(num2 == num3)
     {
         System.out.println("num2 == num3 ");
     }
      else if(num2 == num4)
     {
         System.out.println("num2 == num4 ");
     
     }
     else if(num3 == num1)
     {
         System.out.println("num3 == num1 ");
     }
    else if(num3 == num2)
     {
         System.out.println("num3 == num2 ");
     }
     else if(num3 == num4)
     {
         System.out.println("num3 == num4 ");
     }
    else if(num4 == num1)
     {
         System.out.println("num4 == num1 ");
     }
     else if(num4 == num2)
     {
         System.out.println("num4 == num2 ");
     }
     else if(num4 == num3)
     {
         System.out.println("num4 == num3 ");
     }
     
     
     
     
         
     
    
    
    
    
    
    }
    
}
