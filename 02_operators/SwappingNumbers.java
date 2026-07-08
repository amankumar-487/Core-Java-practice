package operators;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {

        // Swapping two number without using third variables

        Scanner sc = new Scanner(System.in);

        // Take input from users
        System.out.print("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Before swapping");
        System.out.println("num1:" + num1 +" " + "num2:"+ num2);

        // swapping without third variable
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swapping");
        System.out.println("num1:" + num1 +" " + "num2:"+ num2);
    }
}
