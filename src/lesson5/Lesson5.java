/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5;

/**
 *
 * @author lerishav
 */
public class Lesson5 {
    public static void main(String[] args) {
        
        /* The if/else Statement
        if ( <some condition is true> ) <- boolean expression {
            //do something
        } 
        else {
            //do something different
        }
        */
        
        //Declare an array of strings: type[] arrayIdentifier = {comma-seperated list of values};
        //array elements start numbering at 0 1 2 3 
        //to get length <array name>.length
        
//        String[] names = {"Mary", "Bob", "Carlos"};
//        int[] ages = {25, 27, 48};
        
        //another way to declare an array with values
        /*int[] ages = new int[3]; //ages array instantiated with a size of 3
        ages[0] = 19; //assigning values. Multistep approach
        ages[1] = 42;
        ages[3] = 92;
        
        String[] names = new String  [3];
        names[0] = "Mary";
        names[1] = "Bob";
        names[2] = "Carlos";*/
        
        //to get values from the ages array:
        /* int[] ages = {25, 27, 48};
        
        int myAge = ages[0];
        int yourAge = ages[1];
        System.out.println("My age is " + ages [0]);
        
        //Set values from the names array:
        String[] names = {"Mary", "Bob", "Carlos"};
        
        names[0] = "Gary";
        names[1] = "Rob";*/
        
        
        //for loop syntax:
        /* for ( <type> <variable> : <array name> ) {
              <code_block to be performed for each array element>
            } 
        <type> is the data type of each of the elements within the array
        <variable> is the placeholder used to store each element of an array
        : indicates that the object reference that follows is an array
        <array name> is the array, whose length determines the number of iterations to perfform
        
        you have a break keyword you can use to stop the loop
        */
    }
}
