// 9. Perimeter Of Equilateral Triangle
import java.util.*;
public class Solutions_9 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = sc.nextDouble();
        double perimeter = 3 * side;
        System.out.printf("The perimeter of the equilateral triangle is: %.2f\n", perimeter);
        sc.close();
    }
}