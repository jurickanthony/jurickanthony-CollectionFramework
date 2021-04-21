    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

import java.util.ArrayList;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise3 {
     public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.add(3);
       numbers.add(8);
       numbers.add(23);
       numbers.add(91);
       numbers.add(6);
       numbers.add(1);
         System.out.println("Minimum number is in the last index: " + numbers);
       minFront(numbers);
   }

   
public static void minFront(ArrayList<Integer> numbers) {
   int indexOfMin = 0;
   
   for (int i = 0; i < numbers.size(); i++) {
       if (numbers.get(indexOfMin) > numbers.get(i)) { //gi.compare niya ang tanang value sa atong index sulod sa atong array
           indexOfMin = i; //gipasa niya sa minIndex nga variable ang index sa pinakagamay nga value sa atong array
       }
   }
   
   int minValue = numbers.remove(indexOfMin); // gi.tang tang niya ang minIndex sa array name nga numbers which is ang value kay 1 
   numbers.add(0, minValue); // gi.add niya ug balik ang minValus sa index 0 
   System.out.println("Minimum number is in the index[0]: "+numbers);
}
}
