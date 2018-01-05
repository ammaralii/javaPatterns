/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Samir
 */
public class LoadTest extends Test{
//executing general test on hash map
  
    public LoadTest() {
         }

    @Override
     public void execute() {
          
        test1();
        test2();
        test3();
        test4();
        test5();
        
         }

    private void test1() {
        //add 10000 record into hash table and find if they exist
        HashMap<String, String> hash=new HashMap<String, String>();
        for(int i=0;i<10000;i++){
           hash.put(String.valueOf(i),i+"th value");
        }
      }
    private void test2() {
      }
    private void test3() {
      }
    private void test4() {
      }
    private void test5() {
      }
    
}
