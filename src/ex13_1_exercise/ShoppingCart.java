package ex13_1_exercise;

import java.util.*;


public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        
        // Convert the days array into an ArrayList
        // Loop through the ArrayList, printing out "sunday" elements in 
        //   upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList  
        
        ArrayList <String> myArrayList = new ArrayList(Arrays.asList(days));
        
        
        for(String day : days) {
            if (day == "sunday"){
                System.out.println(day.toUpperCase());
            } else {
                System.out.println(day);
            }
        }
        System.out.println(myArrayList);

    }    
}
