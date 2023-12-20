/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06_2_exercise;

/**
 *
 * @author lerishav
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1, item2;
        
        item1 = new Item();
        item2 = new Item();
        
        item1.descr = "Coke";
        item2.descr = "Chips";
        
        item2 = item1;
        
        System.out.println("Item 1: " + item1.descr);
        System.out.println("Item 2: " + item2.descr);
    }
}
