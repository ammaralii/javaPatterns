/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Samir
 */
public class QAEngineer extends Employee implements IEmployee {

    public QAEngineer(String name) {
       this.employeeName=name;
    }
    @Override
    public void update(String message){
         System.out.println(message);
    }
    
}
