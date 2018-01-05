/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

import java.util.ArrayList;

/**
 *
 * @author Sohail
 */
public class Document {
    
    private ArrayList<String> _textArray;

    public Document()
    {
        _textArray = new ArrayList<String>();
    }
    
    // methods for adding and removing lines 
    
    // when one line is add in this scenario it permanently add or remove and cannot
    
    //be get back 

  public void Write(String text)
  {
   _textArray.add(text);
  }
  
  public void Erase(String text)
  {
   _textArray.remove(text);
  }

  public void Erase(int textLevel)
  { 
      _textArray.remove(textLevel);
  
  }
  
  public String ReadDocument()
  {
     StringBuilder sb = new StringBuilder();
    
    
     for( String text : _textArray)
     {
         sb.append(text);
     }
    
     
      return sb.toString();
  }

}

