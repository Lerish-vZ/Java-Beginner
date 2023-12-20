/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_2_exercise;

/**
 *
 * @author lerishav
 */
public class ShoppingCart {
    public static void main(String[] args) {
       //5.2//
       String[] names = {"Sam", "John", "Sally", "Tom"};
       String itemDesc = "Chips";
       String message;
       int quantity = names.length;
       
       message = names[0] + " wants to buy " + quantity + " " + itemDesc;
       
        System.out.println(message);
        System.out.println(names[2]);
    }
}
