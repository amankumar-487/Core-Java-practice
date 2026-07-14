package method;

import java.util.Scanner;

public class checkFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number:");
        int num = in.nextInt();

        int factorial = fact(num);
        System.out.println("Factorial: " + factorial);

    }
    static int fact(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
