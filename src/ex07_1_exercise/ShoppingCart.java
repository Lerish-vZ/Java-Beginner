
package ex07_1_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        spaceIdx = custName.indexOf(' ');
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        
        // Get the index of the space character (" ") in custName. 


        // Use the substring method parse out the first name and print it.


    }
}
