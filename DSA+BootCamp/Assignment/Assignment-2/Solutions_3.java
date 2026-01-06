// 3. Area Of Rectangle Program 
import java.util.Scanner;
public class Solutions_3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth=sc.nextDouble();
        double area=length*breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
}