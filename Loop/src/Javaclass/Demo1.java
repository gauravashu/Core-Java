package Javaclass;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Hello");
            System.out.println("Press 1 to continue");
            ch = sc.nextInt();
        } while (ch == 1);

    }
}
