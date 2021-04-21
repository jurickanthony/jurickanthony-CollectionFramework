/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise6;

import java.util.HashSet;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise6 {
        public static void main(String args[]){   
        equalNames();
    }
    public static void equalNames(){
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
        myName.retainAll(myName1);
        System.out.println("Equal Names in two Arrays: " + myName);

    }
}
