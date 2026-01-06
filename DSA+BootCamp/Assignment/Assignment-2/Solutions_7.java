// 7. Area Of Equilateral Triangle
import java.util.Scanner;
public class Solutions_7 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.printf("The area of the equilateral triangle is: %.2f\n", area);
        sc.close();
    }
}