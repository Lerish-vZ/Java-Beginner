/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author lerishav
 */
public class Lesson12 {
    public static void main(String[] args) {
        
        //INHERITANCE
        
        /* 
        Inheritance allows one class to be derived from another 
          » a child inherits properties and behaviors of the parent
          » a child class inherits the fields and method of a parent class. 
        
        The keyword *extends* creates the inheritance relationship
        super refers to the supreclass
        The subclass's own attributes gets set after invocation of the superclass constructor
        */
        
        
        //OVERRIDING METHODS 
        
        /* 
        Overriding: A subclass implements a method that already has an 
                    implementation in the superclass.
        */
        
        
        //POLYMORPHISM
        
        /*
        You can use the superclass as the reference, you do not have to use the class as a reference.
        ex. 
            Shirt myShirt = new Shirt(); --> uses the class <Shirt> as reference type for the Shirt object.
            
            Clothing garment1 = new Shirt();|
            Clothing garment2 = new Trousers();--> uses the superclass as reference 
                                                » Shirt is a (type of) Clothing.
                                                » Trousers is a (type of) Clothing.
        */
        
        
        //ABSTRACT CLASSES
        
        /* 
        use the <abstract> keyword to create a special class that:
            » Cannot be instantiated
            » May contain concrete methods 
            » May contain abstract methods that must be implemented later by any nonabstract subclasses
        
        All methods within an abstract class must be used in the class that extends it.
        */
    }
}
