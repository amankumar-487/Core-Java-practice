package method;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number:");
        int num = in.nextInt();

        check(num);

    }


    static void check(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        if (count == 2) {
            System.out.println("prime!");
        } else {
            System.out.println("not prime!");
        }
    }
}
