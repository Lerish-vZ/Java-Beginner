/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson4;

/**
 *
 * @author lerishav
 */
public class Lesson4 {
     public static void main(String[] args) {
        /**String name1 = "Harry";
        String name = name1;
        double price = 12.35;
        boolean outOfStock = true;
        int quantity = 5; 
        double total = price * price;
        System.out.println(name);*/
        
       /* String greet1 = "Hello";
        String greet2 = "World";
        String message = greet1 + " " + greet2 + "!";
        String message1 = greet1 + " " + greet2 + " " + 2014 + "!";
        System.out.println(message);   
        System.out.println(message1);*/
       
       /*double quot, num1;
       num1 = 31;
       int num2 = 5; 
       quot = num1 / num2;
       System.out.println(quot);*/ //answer: 6.2
       
       /* Operator Precedence
        Rules of Precedence: 
       1 Operators within a pair of parentheses 
       2 increment and decrement operators (++ or --)
       3 Multiplication and division operators, evaluated from left to right 
       4 Addition and subtraction operators, evaluated from left to right
       */
       
       int a = (((20-5) * 4) / (2 - 10))+ 4;
         System.out.println(a);
       int b = ((20 * 4) / (2 - 10)) + 4;
        System.out.println(b);
       int c = (80 / (2 - 10)) + 4;
        System.out.println(c);
       int d = (80 / -8) + 4;
        System.out.println(d);
       int e = -10 + 4;
        System.out.println(e);
       int f = -6;
        System.out.println(f);
    }
}
