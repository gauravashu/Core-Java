package ARRAY;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {19, 67, 4, 78, 100, 3};
        int max = arr[0] , index = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(" element found at " + index);
    }
}
