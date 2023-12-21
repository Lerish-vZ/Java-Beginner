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
                
    }
}
