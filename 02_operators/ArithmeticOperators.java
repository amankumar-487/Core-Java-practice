package operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            // Taking input from users
        System.out.print("Enter two numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        // print
        System.out.println("sum:" + (num1 + num2));
        System.out.println("Difference:" + (num1 - num2));
        System.out.println("Multiply:" + (num1 * num2));
        System.out.println("Divide:" + (num1 / num2));
        System.out.println("Remender:" + (num1 % num2));
    }
}
