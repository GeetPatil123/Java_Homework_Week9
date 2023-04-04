package javaprogramsweek9;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Program4 {

    public static void main(String[] args) {

        //Arraylist  for generic object can store all of objects
        ArrayList<String> list = new ArrayList<>();//created an arraylist object
        //arraylist collection
        list.add("Red");
        list.add("Orange");
        list.add("yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");

        for (String i : list  ) {//for each to print the list of collection
            System.out.println(i);//print statement to print the list of colours
        }
    }
}
