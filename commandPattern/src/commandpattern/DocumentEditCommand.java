/*
 In this class we will add a reference to added text and a 
reference to our document and how each request will modify document
 */
package commandpattern;

/**
 *
 * @author Sohail
 */
public class DocumentEditCommand extends Command{

    private Document editableDocument;
    
    private String text;

  
  
    
   public DocumentEditCommand(Document d, String txt)
    {
        editableDocument = d;
        
        text = txt;
        
        editableDocument.Write(text);
        
    }
     
    //overridden method giving reference to the document
    // method to add and subtract lines of text
    
    @Override
    public void Redo() {
        editableDocument.Write(text);
    }

    @Override
    public void Undo() {
       
        editableDocument.Erase(text);
    }
    
}
