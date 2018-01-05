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

    public LoadTest() {
         }
   void test1() {
        //add 10000 record into hash table and find if they exist
        HashMap<String, String> hash=new HashMap<String, String>();
        for(int i=0;i<10000;i++){
           hash.put(String.valueOf(i),i+"th value");
        }
   }
  void test2() {
      }
    void test3() {
      }
 void test4() {
   }
   void test5() {
      }
    
}
