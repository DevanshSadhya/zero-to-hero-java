// 8. Perimeter Of Circle
import java.util.Scanner;
public class Solutions_8 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("The perimeter of the circle is: %.2f\n", perimeter);
        sc.close();
    }
}