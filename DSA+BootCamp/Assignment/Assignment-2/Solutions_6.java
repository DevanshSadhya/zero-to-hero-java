// 6. Area Of Rhombus Java Program
import java.util.Scanner;
public class Solutions_6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the first diagonal of the rhombus: ");
        double diagonal1=sc.nextDouble();
        System.out.print("Enter the length of the second diagonal of the rhombus: ");
        double diagonal2=sc.nextDouble();
        double area=0.5*diagonal1*diagonal2;
        System.out.println("The area of the rhombus is: " + area);
    }
}