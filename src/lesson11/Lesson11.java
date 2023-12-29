/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

import java.time.LocalDate; //have to import but does it automatically
import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
//above is called full qualfication
//you qualify classes or packages (with their classes) in order to reference them directly in your code

/* the import statement can be: 
   for just the class in question 
        java.time.LocalDate;
   for all classes in the package 
        java.time.*;
*/
/**
 *
 * @author lerishav
 */
public class Lesson11 {
    //if you need non-Gregorian type dates: 
    //use the java.time.chrone classes
    
    public static void main(String[] args) {
//        LocalDate myDate = LocalDate.now();
//        System.out.println("Today's date: " + myDate);

        //CONVERTING A DATE 
//        LocalDate myDate = LocalDate.now();
//        JapaneseDate jDate = JapaneseDate.from(myDate);
//        System.out.println("Japanese date: " + jDate);

        //FORMATTING DATES
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println("Today's date time (no formatting: " + today);
//        
//        String sdate = today.format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println("Date in ISO_DATE_TIME format: " + sdate);
//        
//        String fdate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
//        System.out.println("Formatted with MEDIUM FormatStyle: " + fdate);

        //TWO DIMENSIONAL ARRAYS
        
        /* 
        Declaring a Two-Dimensional Array:
        int [] [] yearlySale;
        
        SYNTAX: type [] [] array_identifier; 
        
        INSTANTIATING ARRAY 
        instantiates a 2D array: 5 arrays og 4 elements each 
        yearlySales = new int[5][4];
        //5 years (Y axis) with 4 quaters (X axis)
        
        SYNTAX: array_identifier = new type [number_of_arrays] [length];
        
        When initializing [y axis index] [x axis index]
        » yearlySales [0] [0] = 1000; sets it in the top left cell (Year 1, Quarter 1)
        » yearlySales [0] [1] = 1500; sets it in the second cell from the top left (Year 1, Quarter 2)
        */
        
        //WHILE LOOP 
        
        /*
        SYNTAX: 
          » while (boolean_expression) {
                code_block
            }
        
        */
//        System.out.println("/*");
//        int counter = 0;
//        while (counter < 3) {
//            System.out.println(" *");
//            counter++;
//        }
//        System.out.println("*/");

    //FOR LOOP 
    
    /*
    SYNTAX: 
      » for (<type> counter = n; <boolean_expression>; <counter_increment>) {
            code_block;
        }
    */
    
    //DO/WHILE LOOP 
    
    /*
    SYNTAX: 
      » do {
            code_block;
        }
        while (boolean_expression); //; is mandatory
    */
    
    //KEYWORDS
     
    /*
    break; --breaks out of the loop
    continue; --causes the loop to skip the current iteration and go to the next
    */
    
    //NESTED FOR LOOP 
    /* int height = 4, width = 10;
     
     for(int row = 0; row < height; row++){ //produces the rows. Loops 4 times
         for (int col = 0; col < width; col ++) { //produces columns for a given row. Loops 10 times
             System.out.print("@"); //make note it's print not println
         }
         System.out.println(); 
     } */

    
    //NESTED WHILE LOOP 
    
  /*  String name = "Lenny";
    String guess = "";
    int attempts = 0;
    
    while ( !guess.equalsIgnoreCase(name)) {
        guess = "";
        while (guess.length() < name.length()) {
            char asciiChar = (char) (Math.random() * 26 + 97);
            guess += asciiChar;
        }
        attempts++;
    }
        System.out.println(name + " found after " + attempts + " tries!"); */
  
    
    //PROCESSING A TWO-DIMENSIONAL ARRAY
    
  /*  int sales[][] = new int [3][4];
    //initArray(sales); //initialize the array
        System.out.println("Yearly sales by quarter beginning 2010:");
        
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                System.out.println("\tQ" + (j + 1) + " " + sales[i][j]);
            }
            System.out.println();
        } */
  
  //ARRAYLIST
  
  /* 
  Option to designate the object type it contains:
    ArrayList <String> states = new ArrayList();
  
  Call methods on an ArrayList or its elements:
    states.size(); //size of list
    states.get(49).length(); //length of the 49th element 
  */
    }
}
