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
public class RedShapeDecorator extends ShapeDecorator {
 
    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }
    
    @Override
    public void draw()
    {
      setRedBorder(shapeDecorator);
         shapeDecorator.draw();	       
    
    }
    public void setRedBorder(Shape decoratedShape)
    {
        System.out.print("Border Coler : Red");
    }
}
