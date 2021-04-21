/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise8 {
  public static void main(String args[]){  
  
  HashMap<String,String> hash_map = new HashMap<String,String>();  
  hash_map.put("concordia", "Value Given");
  hash_map.put("acconcordia", "Test");
  hash_map.put("condensada" ,"Sweet");
  getKeys(hash_map);
  }
  public static void getKeys(HashMap<String,String>hash_map){
      int ctr= 1;
      Set<String> keys = hash_map.keySet();
        for(String key: keys){
//            System.out.println(key);
            if(key == "concordia"){
                System.out.println("The key value: " + ctr); 
            }
        }
  }
}
      
      
  
