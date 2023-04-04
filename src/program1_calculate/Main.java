package program1_calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //scanner declaration to accept input from the console
        Scanner sca = new Scanner(System.in);
        Calculator obj = new Calculator();
        char choise;
        System.out.println("Program to perform arithmetic operators by selecting desired operator: ");
        do {//this do condition will execute at least ones
            System.out.println("Please enter the First Number : ");
            int a = sca.nextInt();
            System.out.println("Please enter the Second Number: ");
            int b = sca.nextInt();
            System.out.println("Please enter any one operational symbol from +, -, * or /");
            char symbol = sca.next().charAt(0);
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to perform more operations..? Please enter Y or N : ");
            choise = sca.next().charAt(0);
        }
        while (choise == 'Y' || choise == 'y'); //after executing the do body ones it will ask it want to continue and the do while will execute again
        sca.close();//closing scanner object
    }

}
