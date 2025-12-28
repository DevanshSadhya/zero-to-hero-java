// Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.

import java.util.*;
public class Solutions_03{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Getting principal, time, and rate from user
        System.out.print("Enter principal amount (P): ");
        double principal = input.nextDouble();
        System.out.print("Enter time (T) in years: ");
        double time = input.nextDouble();
        System.out.print("Enter rate of interest (R) in percentage: ");
        double rate = input.nextDouble();

        // Calculating simple interest
        double simpleInterest = (principal * time * rate) / 100;

        // Displaying the result
        System.out.println("Simple Interest: " + simpleInterest);
    }
}