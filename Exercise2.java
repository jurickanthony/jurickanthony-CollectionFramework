/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise2 {
     public static void main(String args[]){   
        shuffleNames();
}
     public static void shuffleNames(){
         ArrayList<String> myColor = new ArrayList<String>();
        myColor.add("red");
        myColor.add("orange");
        myColor.add("yellow");
        myColor.add("green");
        myColor.add("blue");
        myColor.add("indigo");
        myColor.add("violet"); 
        System.out.println("Original List : \n" + myColor);  
        Collections.shuffle(myColor);
        System.out.println("\nShuffled List : \n" + myColor);
     }
    
}
