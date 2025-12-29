// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
public class Solutions_04{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Getting two numbers and an operator from user
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        // Performing calculation based on the operator
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        // Displaying the result
        System.out.println("Result: " + result);
    }
}