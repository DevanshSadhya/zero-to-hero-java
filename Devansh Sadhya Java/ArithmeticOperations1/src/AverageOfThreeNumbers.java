import java.util.Scanner;

public class AverageOfThreeNumbers {
    public  static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=input.nextInt();
        System.out.println("Enter the second number");
        int b=input.nextInt();
        System.out.println("Enter the third number");
        int c=input.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("The area of the rectangle is "+avg);
    }
}
