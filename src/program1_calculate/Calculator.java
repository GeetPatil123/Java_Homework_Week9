package program1_calculate;

public class Calculator {//class

    public void addition(int a, int b){//method with return type and two parameters

        System.out.println("The Addition of two numbers: " + a + " and " + b + " is " + (a + b));
    }

    public void subtraction(int a, int b){//method with return type and two parameters

        System.out.println("The Subtraction of two numbers: " + a + " and " + b + " is " + (a - b));
    }

    public void multiplication(int a, int b){//method with return type and two parameters

        System.out.println("The Multiplication of two numbers: " + a + " and " + b + " is " + (a * b));
    }

    public void division(int a, int b){//method with return type and two parameters

        System.out.println("The Division of two numbers: " + a + " and " + b + " is " + (a / b));
    }

    public void calculateResult(int a, int b, char symbol){
        if (symbol == '+'){
            addition(a,b);
        } else if (symbol == '-') {
            subtraction(a,b);
        } else if (symbol == '*') {
            multiplication(a,b);
        } else if (symbol == '/') {
            division(a,b);
        } else {
            System.out.println("Invalid operational symbol entered pleases enter +, -, * ,or /");
        }
    }
}
