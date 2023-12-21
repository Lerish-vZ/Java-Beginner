package ex11_1_exercise;

// import statements here:

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate;
        
	// Initialize the orderDate to the current date and time. Print it.
         orderDate = LocalDateTime.now();

	// Format orderDate using ISO_LOCAL_DATE; Print it.
        System.out.println("Order Date: " + (orderDate.format(DateTimeFormatter.ISO_DATE)));

    }
}