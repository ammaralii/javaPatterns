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
public abstract class Game {
    abstract public void initialize();
     
    abstract public void startPlay();
    
     abstract public void endPlay();
    
     // the method should be implement by every class in it's own way but the method of excution will follow strictly
    public final void  play()
    {
    
      initialize();
    
      startPlay();
      
      endPlay();
      
      
   

    }
  }
