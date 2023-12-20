
package ex08_2_exercise;


public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    
    public void setItemFields (String description, int qty, double price) {
        this.desc = description;
        this.quantity = qty;
        this.price = price;                
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    public int setItemFields(String description, int qty, double price, char color){
        if (color == ' '){
            return -1;
        } 
        else {
            this.colorCode = color; 
            this.desc = description;
            this.quantity = qty;
            this.price = price;
            
            return 0;
        }
    }
    
    
}
