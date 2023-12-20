/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_2_exercise;

/**
 *
 * @author lerishav
 */
public class ShoppingCartCont {
    public static void main(String[] args) {
        String custName = "Sam", itemDesc = "Chips";
        String message;
        //2//
        double price = 10.99, tax = 0.5;
        int quantity = 4;
        double total;
        
        //2//
        message = custName + " wants to buy " + quantity + " " + itemDesc;
        
        System.out.println(message);
        
        //2//
        total = price * quantity * tax;
        String totalCost = "Total cost with tax is: " + total;
        System.out.println(totalCost);
    }
    
}
