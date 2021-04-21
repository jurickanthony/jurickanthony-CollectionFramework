/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise7;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise7 {
    public static void main(String args[]){   
    uniqueNames();
}
    public static void uniqueNames(){
HashSet<String> myName = new HashSet<String>();
        myName.add("Jurick");
        myName.add("Anthony");
        myName.add("Baybayanon");
        myName.add("Jurick Anthony Baybayanon");
        myName.add("19104876");
        System.out.println("First Array: " + myName);
        HashSet<String> myName1 = new HashSet<String>();
        myName1.add("Jurick");
        myName1.add("Anthony");
        myName1.add("Baybayanon");
        System.out.println("Second Array: " + myName1);
        myName.removeAll(myName1);
        System.out.println("Unique words:    " + myName);
        

    }
}
