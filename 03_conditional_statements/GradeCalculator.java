package conditional_statements;

import java.util.Scanner;

public class GradeCalculator {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take input from the users
        System.out.print("Enter marks:");
        double marks = in.nextDouble();

        if(marks >= 90 && marks <=100){
            System.out.println("Grade: A+");
        } else if(marks >= 80 && marks < 90){
            System.out.println("Grade: A");
        } else if(marks >= 70 && marks < 80){
            System.out.println("Grade: B");
        } else if(marks >= 60 && marks < 70){
            System.out.println("Grade: C");
        } else if(marks >= 50 && marks < 60){
            System.out.println("Grade: D");
        } else {
            System.out.println("Better Luck Next Time!");
        }
    }
}
