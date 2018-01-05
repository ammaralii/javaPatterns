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
public class TemplatePatterenDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Game g;
       
       g = new Cricket();
       
      //beside this I implent the game end method in cricket concrete class first but
      //it is still accessible only its default position defined by game
       g.play();
       
    }
    
}
