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
public class SingletonPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //private access that's why no object      
//Singleton pattren = new Singleton ();

     Singleton pattrenObj = Singleton.getInstance();
     
     pattrenObj.someMessage();
    }
    
}
