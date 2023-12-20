/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_1_exercise;

/**
 *
 * @author lerishav
 */
public class ShoppingCart {
    public static void main(String[] args) {
        //5.1//
        boolean outOfStock = false;
        
        String custName = "Sam", itemDesc = "Chip";
        String message;
        
        //2.2//
        double price = 10.99, tax = 0.5;
        int quantity = 4;
        double total;
       
        //2.2//
        total = price * quantity * tax;
        String totalCost = "Total cost with tax is: " + total;
        
        //5.1//
        if (quantity > 1) {
            itemDesc = itemDesc + "s";
        }
        
        //2.2//
        message = custName + " wants to buy " + quantity + " " + itemDesc;
        
        if (outOfStock) {
            System.out.println("Unfortunately, " + itemDesc + " is out of stock.");
        }
        else {
            System.out.println(message);
            System.out.println(totalCost);
        }
    }
}
