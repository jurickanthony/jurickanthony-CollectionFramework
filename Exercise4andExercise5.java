/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4andExercise5;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise4andExercise5 {
    //Exercise Number 4 Answer
    //One motivation behind why you should utilize isEmpty() over physically contrasting the size is 
//    that the previous makes it more clear what your code is really checking.
    
//Exercise number 5

//The biggest differences are that a foreach loop processes an instance of each element in a collection in turn, 
//while a for loop can work with any data and is not restricted to collection elements alone. 
//This means that a for loop can modify a collection - which is illegal and will cause an error in a foreach loop.
//Performance: According to JsPerf : forEach is little slower than for loop.
//Usability: There is no way we can break/return from the callback in case of forEach loop.
//Readability: Using for loop makes code more readable than having forEach in code.
//Browser compatibility: forEach is Not supported in IE < 9 So that introduces some shim in our code.    
}
