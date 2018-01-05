/*
  Invoker object. This object serves as a repository for all 
  request objects for this particular document:
 */
package commandpattern;

import java.util.ArrayList;

/**
 *
 * @author Sohail
 */
public class DocumentInvoker {
    
   
    private ArrayList command = new ArrayList();
    
   //we will create and store new document when invoker
    //instance is created. The invoker then , can allow any command
    //to access and modify the document text
    

    private Document document = new Document();
    
    
    //which command is used on the documen is based on the 
    
    // historical level, or number of request in the queue
    
    
public void Redo( int level )
{
    System.out.println("...Redo level\t" + level);

   ((Command) command.get(level)).Redo();

}

public void Undo( int level )
{
    
    System.out.println("...Undo  level\t" + level);
    
    ((Command) command.get(level)).Undo();
}


//The document acts as the receiver of the action of the request, and the invoker is the container for all the actions.
//Below we see that the invoker class methods create and store commands, as well as apply them to the document

 public void Write(String text)
    {
        DocumentEditCommand cmd = new DocumentEditCommand(document,text);
        
        command.add(cmd);
    }
    
    public String Read()
    {
        return document.ReadDocument();
    }
    
    
    //Now, we will look at how we can use the invoker and command relationship to the document to perform undo and redo actions on the document. 
    //First, we need to write some text to the document:
     


}