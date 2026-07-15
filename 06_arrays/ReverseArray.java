package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array size:");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter array elements:");
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }

        // calling reverse method
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Reverse Method
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    // Swap Method
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
