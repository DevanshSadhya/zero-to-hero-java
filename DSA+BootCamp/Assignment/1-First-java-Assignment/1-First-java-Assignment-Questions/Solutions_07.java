// to calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Solutions_07 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Getting the number of terms from user
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = input.nextInt();

        int first = 0, second = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

