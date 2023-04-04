package javaprogramsweek9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Program7 {

    public void arraylistEmptyOrNot(){//instance method
        //creating an arraylist String type
        ArrayList<String> fruit = new ArrayList<>();
        //arraylist collection
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Grapes");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Pears");
        fruit.add("Pineapple");
        fruit.add("orange");

        //used if to check if the arraylist is empty or not
        if (fruit.isEmpty()){
            System.out.println("Arraylist is Empty: ");
        } else {
            System.out.println("Arraylist is not Empty: ");
        }

        //printing all the elements of the arraylist
        System.out.println("Arraylist: " +fruit);

    }

    public static void main(String[] args) {//main method
        Program7 obj = new Program7();//created an object of the instance method
        obj.arraylistEmptyOrNot();//calling instance method
    }
}