/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_3_exercise;

/**
 *
 * @author lerishav
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String[] items = {"Coke", "Sprite", "Simba Chips", "Lollipops", 
                          "Snow Cone", "Lays Chips"};
        
        System.out.println("Items Purchased: ");
        
        for (String item : items) {
            System.out.println(item);
        }
    }
}
