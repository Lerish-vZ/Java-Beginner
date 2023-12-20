/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

import java.awt.BorderLayout;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lerishav
 */
public class ShoppingCart {
    public static void main(String[] args) {
//        Shirt myShirt = new Shirt();
//        Shirt yourShirt = new Shirt("Long sleeved", 'M', 12.35);
//        yourShirt.display();
//        myShirt.display();
//        System.out.println("end of main method");

         /* Shirt shirt01 = new Shirt();
          Shirt shirt02 = new Shirt();
          Shirt shirt03 = new Shirt();
          Shirt shirt04 = new Shirt();
          
          shirt01.setFields("Long Sleeved", 'B', 30.2);
          shirt02.setFields("Polo", 'W', 35.99);
          shirt03.setFields("Buttoned", 'G', 25.6);
          shirt04.setFields("T-Shirt", 'M', 32.8); */ 
         
//         Shirt shirt01 = new Shirt("Long Sleeved", "Blue", 30.2);
//         Shirt shirt02 = new Shirt("Polo", "W", 35.99);
//         Shirt shirt03 = new Shirt("Buttoned", "G", 25.6);
//         Shirt shirt04 = new Shirt("T-Shirt", "Multi", 32.8);
//         
//          shirt01.display();
//          System.out.println("----");
//          shirt02.display();
//          System.out.println("----");
//          shirt03.display();
//          System.out.println("----");
//          shirt04.display(); 
    Shirt myShirt = new Shirt(); 
        System.out.println("Shirt color: " + myShirt.colorCode);
        changeShirtColor(myShirt, 'B');
        System.out.println("Shirt color: " + myShirt.colorCode);
    }
    
     public static void changeShirtColor(Shirt theShirt, char color) {
        theShirt.colorCode = color;
    }  
    
}

 class Shirt {
    public String description = "description";
    public char colorCode; 
    public double price; 
    
        public Shirt() { //Constructor - its purpose is primarily to set default values.
        description = "--description required--";
        colorCode = 'U';
        price = 0.00;
    } 
    
    
    public void setFields (String desc, double price) {
        this.description = desc; 
        this.price = price;
    }
    
    public void setColor (String theColor) {
        if (theColor.length() > 0) {
            colorCode = theColor.charAt(0);
        }
    }
    
//     public Shirt(String desc, String color, double price) { //Can create more than one Constructor just cannot have the same arguments
//         setFields(desc, price);
//         setColor(color);
//    }
    
    public void display() {
        System.out.println("Item Description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Price: " + price);
    }
   
}
