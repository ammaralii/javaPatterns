/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.*;

/**
 *
 * @author Samir
 */
public class Controller {
    private Test test;
     public Controller() {
     }

     public void execute(String testSuit, String testerName, String logFileName, String processor, String ram) {
          /*
            General
            Load
            DBOperation
            Session           
            */
        switch(testSuit){           
            case "General":
                test=new GeneralTest();
                test.executetest();
                break;
            case "Load":
                test=new LoadTest();
                test.executetest();
                break;
            case "DBOperation":
                test=new DBOperationTest();
                test.executetest();
                break;
            case "Session":
                test=new PerformanceTest();
                test.executetest();
                break;
        }
    }
    
}
