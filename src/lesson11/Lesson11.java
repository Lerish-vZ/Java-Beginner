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
        System.out.println("/*");
        int counter = 0;
        while (counter < 3) {
            System.out.println(" *");
            counter++;
        }
        System.out.println("*/");
    }
}
