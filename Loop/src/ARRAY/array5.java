package ARRAY;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    int largest = 0;
    int second = 0;
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    for (int i = 2; i < arr.length; i++) {
        if (arr[i] > largest) {
            second = largest;
            largest = arr[i];
        } else if (arr[i] > second && arr[i] != largest) {
            second = arr[i];
        }
    }
    System.out.println("largest value of " + largest);
    System.out.println("second value of " + second);
    }
}