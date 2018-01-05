/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author Sohail
 */
public class Context {
    
    private Strategy stragy;
    
    public Context(Strategy stragy)
    {
        this.stragy = stragy;
    }
    
    
    public int executeOperation(int num1 , int num2)
    {
    
    return stragy.doOperation(num1, num2);
    }
}
