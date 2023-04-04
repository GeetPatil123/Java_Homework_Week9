package javaprogramsweek9;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Program8 {

    public static void hashSet() {
        //creating hashset  object called num
        HashSet<Integer> num = new HashSet<>();
        //adding value to the set
        num.add(4);
        num.add(7);
        num.add(8);

        //to show numbers between 1 and 10 are in the set
        for (int i = 1 ; i <= 10; i++) {//this will print 1-10 numbers
            if (num.contains(i)){//this will check if 4,7 & 8 is present in the Hashset list
                System.out.println(i+ " Number was found in the set ");//if found the number will print found the number in front of the number
            } else {
                System.out.println(i+ " Number was not found in the set ");//if not fount the number will print not found in front of the number
            }
        }
    }

    public static void main(String[] args) {//main method
        hashSet();//calling static method
    }
}
