/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author Sohail
 */
public class Singleton {
   
    
    
    private static Singleton instanace = new Singleton();
    
    private Singleton()
    {
    
    }
      
    public static Singleton getInstance()
    {
        return instanace;
    }
    
    public void someMessage()
    {
    System.out.println("Hello I am the only object");
    }
}
