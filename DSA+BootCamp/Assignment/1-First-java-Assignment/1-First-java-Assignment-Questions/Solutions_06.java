// Input currency in rupees and output in USD.
import java.util.Scanner;
public class Solutions_06 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Getting amount in rupees from user
        System.out.print("Enter amount in rupees: ");
        double rupees = input.nextDouble();

        // Conversion rate from rupees to USD
        double conversionRate = 0.012; // 1 rupee = 0.012 USD

        // Converting rupees to USD
        double usd = rupees * conversionRate;

        // Displaying the result
        System.out.println("Amount in USD: " + usd);
    }
}