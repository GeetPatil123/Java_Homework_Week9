package javaprogramsweek9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5.Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class Program5 {

        ArrayList<String> lang = new ArrayList<>();//created array list string type

        public void programmingLanguages(){//instance method
            lang.add("Java");
            lang.add("C");
            lang.add("c++");
            lang.add("Python");
            lang.add("SQL");

            //created an iterator
            Iterator<String> it = lang.iterator();

            // used while loop to display the collection
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }

    public static void main(String[] args) {//main method
        Program5 obj = new Program5();// created object to the instance method
        obj.programmingLanguages();//calling through the object the instance  method
    }
}
