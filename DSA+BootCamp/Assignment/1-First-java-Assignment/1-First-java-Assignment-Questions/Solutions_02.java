// 2. Take name as input and print a greeting message for that particular name.
import java.util.*;
public class Solutions_02{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        //getting user name
        System.out.println("Enter your name:");
        String name=input.next();
        //printing greeting message
        System.out.println("Hello, " + name + "! Welcome!");
    }
}