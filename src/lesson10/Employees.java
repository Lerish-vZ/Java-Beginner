/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author lerishav
 */
public class Employees {

    public String name1 = "Fred Smith";
    public String name2 = "Fred Smith";

    public void areNamesEqual() {
        //if (name1.equals(name2)) {
        //if (name1.equalsIgnoreCase(name2)) {
        if (name1 == name2) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        }
    }
}
