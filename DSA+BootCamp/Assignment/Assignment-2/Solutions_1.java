
import java.util.Scanner;

// 1. Area Of Circle Java Program
public class Solutions_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println("The area of the circle is: " + area);
    }
}
