/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Samir
 */
public class GeneralTest extends Test {
//executing general test on hash map
    
    public GeneralTest() {
       }
    @Override
    public void execute() {       
        test1();
        test2();
        test3();
        test4();
        test5();
        
        
         }
    
    /*
        the count should be greater than 0 less than 2 and value should be ahmad
    */
    private void test1() {
        HashMap<String, String> hash=new HashMap<String, String>();
        hash.put("01", "ahmad");
        
        if(hash.size()>0 && hash.size()<2)
        {
            log.logTest("Test1", "Passed", "after adding a value into hash table, the count exceeded by 1");
           
        }
        else{
            log.logTest("Test1", "failed", "after adding a value into hash table, the count didn't exceed by 1");
        }
    }
    
     /*
        there must be no value inside the hash table once cleared
    */
    private void test2() {
         HashMap<String, String> hash=new HashMap<String, String>();
        hash.put("01", "ahmad");
        if(hash.size()>0){
            hash.clear();
            if(hash.size()==0)
            {
                 log.logTest("Test2", "Passed","value added to the hash table and clear method is executed. The table left with "
                         + "zero count after clear method");
            }
            else{
                log.logTest("Test2", "failed","value added to the hash table and clear method is executed. The table left with "
                         + "!=0 count after clear method");
            }
        }
        else{
            log.logTest("Test2", "failed","value added to the hash and table size remain < = 0");
        }
      }
    private void test3() {
      }
    private void test4() {
      }
    private void test5() {
      }

   
    
}
