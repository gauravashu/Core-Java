package ques;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater = Math.max(a, b);
        System.out.println(greater);
    }
}
