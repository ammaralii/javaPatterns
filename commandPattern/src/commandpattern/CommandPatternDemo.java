/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author Sohail
 */
public class CommandPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       DocumentInvoker instance = new DocumentInvoker ();
        
       instance.Write("This is the original text.");
        
       instance.Write(" Here is some other text.");
       
        System.out.println(instance.Read());
        
        instance.Undo(1);
        
        System.out.println(instance.Read());
        
        
        instance.Redo(1);
        
        instance.Write("This is the text after here is some other text");
        
        System.out.println(instance.Read());

    }
    
}
