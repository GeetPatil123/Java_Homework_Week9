package javaprogramsweek9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Program3 {

    public static void reverseArrayValues(){//static method
        //creating arraylist
        ArrayList<Integer> list = new ArrayList();

        //creating the collection
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(3);
        //print statement to print before anf after the reverse
        System.out.println("Numbers before reverse: " + list);
        Collections.reverse(list);
        System.out.println("Numbers after reverse: " +list);
    }

    public static void main(String[] args) {//main method
        reverseArrayValues();//calling the static method
    }
}
