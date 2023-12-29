package ex11_4_exercise;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList <String> names;
        names = new ArrayList();
        
        // add (insert) another element at a specific index
        names.add("John");
        names.add("Meg");
        names.add("Susan");
        
        System.out.println(names);
        
        names.add(0, "Pepper");
        
        System.out.println(names);

	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        
        if(names.contains("Susan")){
            names.remove("Susan");
        }
      System.out.println(names);  
    }
}
