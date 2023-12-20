/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author lerishav
 */
public class Lesson8 {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        
//        calc.printString();
//        System.out.println(calc.returnString());
//        System.out.println(calc.sum(2, 1));
//        System.out.println(calc.isGreater(1, 2));
//        
//        /*int num1 = 1, num2 = 2;
//        int result = num1 + num2;
//        System.out.println(result);*/
//        
//        int num1 = 1, num2 = 2;
//        int result = sum(num1, num2);
//        System.out.println(result);
//      }
//    
//    public static int sum (int x, int y) {
//        return(x + y);
//    }
    
//   Item item1 = new Item();
//   item1.setSize(ItemSizes.mMed);

    int totalOne = Calculator.sum(2, 2);
        System.out.println(totalOne);
        System.out.println("---");
    float totalTwo = Calculator.sum(2.0F, 2.0F);
        System.out.println(totalTwo);
        System.out.println("---");
    float totalThree = Calculator.sum(2, 2F);
        System.out.println(totalThree);        
   
  }
    

class Calculator {
     
    public static int sum(int num1, int num2) {
        System.out.println("Method One");
        return num1 + num2;
   }
    
   public static float sum(float num1, float num2) {
        System.out.println("Method Two");
        return num1 + num2;
   }
   
   public static float sum(int num1, float num2) {
        System.out.println("Method Three");
        return num1 + num2;
   }
//    
//    public void printString() {
//        System.out.println("Hello");
//    }
//    
//    public String returnString() {
//        return("Hello");
//    }
//    
//    public int sum (int x, int y) {
//        return(x + y);
//    }
//    
//    public boolean isGreater (int x, int y) {
//        return( x > y);
//    }
    
//    public class ItemSizes {
//        static final String mSmall = "Men's Small";
//        static final String mMed = "Men's Medium";
    }
    
}

