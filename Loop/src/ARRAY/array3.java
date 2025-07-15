package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.print(sum);
    }
}
