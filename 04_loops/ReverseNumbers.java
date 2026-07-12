package loops;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers:");
        int num = in.nextInt();

        int reverse = 0;
        while(num>0){
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;

            num = num / 10;
        }
        System.out.println("Reverse Numbers:" + reverse);
    }
}
