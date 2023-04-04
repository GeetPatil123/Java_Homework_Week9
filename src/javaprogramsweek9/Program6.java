package javaprogramsweek9;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Program6 {

    public void retrieveElementFromArrayList(){// instance method
        //creating an arraylist
        ArrayList<String> cars = new ArrayList<>();
        //arraylist collection
        cars.add("Toyota Yaris");
        cars.add("Honda Civic");
        cars.add("Kia Niro");
        cars.add("Hyundai Tucson");
        cars.add("Kia Sportage");
        cars.add("Toyota RAV4");
        cars.add("Lexus NX");
        cars.add("Kia Sorento");

        //print statement to print the list of cars and car name in index 2
        System.out.println("List of cars: " + cars );
        System.out.println(cars.get(2));//it will print Kia Niro as array index starts from 0

    }

    public static void main(String[] args) {// main method
        Program6 obj =new Program6();//created an object of the instance method
        obj.retrieveElementFromArrayList();//calling instance method;
    }
}
