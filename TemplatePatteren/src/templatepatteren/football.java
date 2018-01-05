/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepatteren;

/**
 *
 * @author Sohail
 */
public class football extends Game{

     @Override
    public void initialize() {
       System.out.println("Cricket Game Initialize");
    }

    @Override
    public void startPlay() {
     System.out.println("Cricket Game start");  
    }

    @Override
    public void endPlay() {
     System.out.println("Cricket Game end");
    
    }
}
