package loops;

import java.util.Scanner;

public class PatternQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take input from users
        System.out.print("Enter Number:");
        int num = in.nextInt();

        int star = 1;
        for(int i = 0; i< num; i++){
            // space
            for(int j = 0; j< num -i-1; j++){
                System.out.print(" ");
            }
            // star
            for(int j = 0; j< star; j++){
                System.out.print("*");
            }
            // space
            for(int j = 0; j< num -i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
            star+=2;
        }
    }
}
