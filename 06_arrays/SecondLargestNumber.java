package arrays;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Array Size:");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter array element:");
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // Maximum Element
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        // Second Maximum Element
        int secondMax = Integer.MIN_VALUE;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] > secondMax && arr[j] < max){
                secondMax = arr[j];
            }
        }
        System.out.println("Second Maximum Element: " + secondMax);

    }
}

