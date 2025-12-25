import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter your choice i.e,+,-,*,/: ");
        char choice=input.next().charAt(0);
        switch(choice){
            case '+': System.out.println("Addition: " + (firstNumber + secondNumber));break;
            case '-': System.out.println("Subtraction: " + (firstNumber - secondNumber));break;
            case '*': System.out.println("Multiplication: " + (firstNumber * secondNumber));break;
            case '/': System.out.println("Division: " + (firstNumber / secondNumber));break;
            default: System.out.println("Invalid choice");
        }
    }
}