/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.*;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author Samir
 */
public class Controller {
    private Test test;
    private List<IEmployee> observerList=new ArrayList<IEmployee>();
     public Controller() {
     }
     
     void register(List<IEmployee> observerList){
          this.observerList=observerList;        
     }
     public void execute( String testSuit, String testerName, String logFileName, String processor, String ram) {
         try{
            File file=new File("Team");
            FileReader reader=new FileReader(file); 
            if(reader!=null){
            BufferedReader br = new BufferedReader(reader);
                String record=null;
                while((record=br.readLine( )) != null){
                    String[] arr=record.split("\\s");
                   switch(record.split("\\s")[1]){
                       case "Project_Manager":
                            observerList.add(new ProjectManager(record.split("\\s\\s")[0]));
                            break;
                       case "QA_Lead":
                           observerList.add(new QALead(record.split("\\s\\s")[0]));
                           break;
                       case "Developer":
                           observerList.add(new Developer(record.split("\\s\\s")[0]));
                           break;
                       case "QA_Engineer":
                           observerList.add(new QAEngineer(record.split("\\s\\s")[0]));
                           break;
                       case "Dev_Lead":
                           observerList.add(new QALead(record.split("\\s\\s")[0]));
                           break;
                   }
                }
            }
        }
        catch(Exception e)
        {
        }       
        switch(testSuit){           
            case "General":
                test=new GeneralTest();                
                test.executeTest(testerName,logFileName,processor,ram,observerList);
                break;
            case "Load":
                test=new LoadTest();
                test.executeTest(testerName,logFileName,processor,ram,observerList);
                break;
            case "DBOperation":
                test=new DBOperationTest();
                test.executeTest(testerName,logFileName,processor,ram,observerList);
                break;
            case "Performance":
                test=new PerformanceTest();
                test.executeTest(testerName,logFileName,processor,ram,observerList);
                break;
        }
    }
 }
