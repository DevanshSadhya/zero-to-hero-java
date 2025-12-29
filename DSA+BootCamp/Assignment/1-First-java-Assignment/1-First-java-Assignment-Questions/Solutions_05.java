// Take 2 numbers as input and print the largest number.
import java.util.*;
public class Solutions_05{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Getting two numbers from user
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        // Finding the largest number
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The largest number is: " + num2);
        }
        else if(num1==num2){
            System.out.println("Both numbers are equal.");
        } 
        else {
            System.out.println("Both numbers are equal.");
        }
    }
}