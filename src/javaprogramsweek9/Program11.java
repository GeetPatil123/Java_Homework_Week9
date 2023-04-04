package javaprogramsweek9;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Program11 {

    public static void main(String[] args) {//main method
        //created an arraylist
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

         System.out.println(c1); // printing ArrayList c1 for user
        System.out.println(c2); // printing ArrayList c2 for user
        boolean compare = c1.equals(c2); // comparing the two ArrayLList and returning boolean value
        System.out.println(compare); // printing true or false depending on boolean value

    }
}
