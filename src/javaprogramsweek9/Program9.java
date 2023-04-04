package javaprogramsweek9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Program9 {

    public static void main(String[] args) {//main method

        //created an HashMap object called people with String keys and Integer values
        Map<String, Integer> people = new HashMap<>();
        people.put("David", 12);
        people.put("Sam", 2);
        people.put("Olivia", 13);
        people.put("Ava", 4);
        people.put("Leo", 5);
        people.put("James", 16);
        people.put("Lucas", 17);
        people.put("Noah", 8);
        people.put("william", 9);
        people.put("Emma", 10);
        //iterating a map using the forEach() method
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }

    }
}
