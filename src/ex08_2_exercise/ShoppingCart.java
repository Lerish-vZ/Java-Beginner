
package ex08_2_exercise;


public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("T-Shirt", 4, 12.5);
        item1.displayItem();
        
        // Call the 4-arg setItemFields method, checking the return value.  
        if (item1.setItemFields("Polo Shirt", 10, 20.99, ' ') < 0) {
            System.out.println("Invalid Color");
        } 
        else {
            item1.displayItem();
        }

	// Test your code for both valid and invalid values
 
        
        
    }
}
