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
public class Developer extends Employee implements IEmployee {

    public Developer(String name) {
        this.employeeName=name;
    }
    @Override
    public void update(String message){
        FileWriter file;
        BufferedWriter buffer;
        try{
            file=new FileWriter("Developer Notification",true);
            buffer=new BufferedWriter(file);
            buffer.append(message);
            buffer.close();
        }
        catch(Exception e)
        {
            
        }
    }
}
