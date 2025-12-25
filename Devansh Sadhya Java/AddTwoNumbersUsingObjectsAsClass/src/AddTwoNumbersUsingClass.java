import java.util.Scanner;
class Addition{
    int num1;
    int num2;

    void setVale(int a, int b) {
        num1 = a;
        num2 = b;
    }
    int add() {
        return num1 + num2;
    }
}

public class AddTwoNumbersUsingClass {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.setVale(10,30);
        int result = obj.add();
        System.out.println(result);
    }
}
