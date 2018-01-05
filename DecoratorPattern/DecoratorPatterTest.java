/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author Sohail
 */
public class DecoratorPatterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Shape circle = new Circle();
       
       circle.draw();
       
       
       Shape redCircle = new RedShapeDecorator(new Circle());
       
       redCircle.draw();
       
   
       
       
    }
    
}
