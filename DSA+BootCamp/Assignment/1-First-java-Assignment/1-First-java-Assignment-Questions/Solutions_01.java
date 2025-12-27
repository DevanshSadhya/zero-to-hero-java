//This is the soltion file for first java assignment
//1.Write a program to print whether a number is even or odd, also take input from the user.

import java.util.*; 

public class Solutions_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //getting input from user
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        //checking even or odd
        if(number%2==0){
            System.out.println(number+" is an Even number.");
        }
        else{
            System.out.println(number+" is an Odd number.");
        }
    }
}