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
public class StrategyPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Context context = new Context(new Add());
        
        System.out.println(context.executeOperation(2, 3));
    
        context = new Context(new Subtract());
       
       System.out.println(context.executeOperation(4, 3));
    
    }
    
}
