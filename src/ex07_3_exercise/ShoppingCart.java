
package ex07_3_exercise;

public class ShoppingCart {
    public static void main(String[] args){
        int int1;
        
	//  Declare and initialize variables of type long, float, and char.
        long longNum = 253256985698L;
        float numF = 46.87F;
        char gen = 'M';
        
        // Print the long variable.
        
        System.out.println("Long Number: " + longNum);

	// Assign the long to the int and print the int variable.
        
        int1 = (int) longNum;
        System.out.println("int1: " + int1);
    }
}
