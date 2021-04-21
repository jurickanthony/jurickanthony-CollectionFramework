/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise1 {
        public static void main(String args[]){   
            sortNames();
    }
    public static void sortNames(){
        ArrayList<String> gamitSaPn = new ArrayList<String>();     
        gamitSaPn.add("Lamesa");   
        gamitSaPn.add("Plato");   
        gamitSaPn.add("Kutsara");   
        gamitSaPn.add("Kaldero");   
        gamitSaPn.add("Baldi");   
        gamitSaPn.add("Tinidor");   
        gamitSaPn.add("Platito");     
        System.out.println("Before Sorting: "+ gamitSaPn);   
        Collections.sort(gamitSaPn);      
        System.out.println("After Sorting: "+ gamitSaPn);
    }
}  

