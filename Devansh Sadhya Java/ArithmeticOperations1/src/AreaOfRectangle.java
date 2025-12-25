//write a java program to calculate area of rectangle.
/* area of rectangle=length*breadth*/
import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //geeting length
        System.out.println("enter the length of the rectangle");
        int length=input.nextInt();
        System.out.println("enter the width of the rectangle");
        int width=input.nextInt();
        int area=length*width;
        System.out.println("The area of the rectangle is "+area);
    }
}