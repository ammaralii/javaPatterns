/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.*;

/**
 *
 * @author Samir
 */
public class TestLogger {
    private static TestLogger test;
    private String name;
    private TestLogger(String name)
    {
        this.name=name;
    }
    public static TestLogger getInst(String name){
        if(test==null)
        {
             test=new TestLogger(name);
        }
         return test;
    }
    public void logTest(String id, String status, String description){
        FileWriter file;
        BufferedWriter buffer;
        try{
            file=new FileWriter(name,true);
            buffer=new BufferedWriter(file);
            buffer.append(id+"  "+status+"  "+description);
            buffer.close();
        }
        catch(Exception e)
        {
            
        }
    }
}
