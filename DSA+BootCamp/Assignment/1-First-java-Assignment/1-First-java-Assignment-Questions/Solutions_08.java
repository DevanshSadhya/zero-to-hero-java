// To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class Solutions_08 { 
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Getting the string from user
        System.out.print("Enter a string: ");
        String original = input.nextLine();

        // Reversing the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Checking if the original string is equal to the reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}