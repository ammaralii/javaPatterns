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
public abstract class ShapeDecorator implements Shape{
    
    protected Shape shapeDecorator;
    
    public ShapeDecorator(Shape shapeDecorator)
    {
        this.shapeDecorator = shapeDecorator;
    }

    @Override
    public void draw() {
       shapeDecorator.draw();
    }
    
    
}
