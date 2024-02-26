package ex12_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // declare and instantiate a Shirt object using an Item reference type
//        Item item1 = new Shirt(2.99, 'M', 'B');
        Item item1 = new Item();

        // call the display method on the object, then the getColor method
        item1.display();
        if (item1 instanceof Shirt) {
            String color = ((Shirt) item1).getColor();
            System.out.println("Color of " + item1.getDesc() + ": " + color);
        } else {
            System.out.println("Item is not a shirt.");
        }
    }
}
