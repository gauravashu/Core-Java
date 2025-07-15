package Javaclass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int n;
            do {
                System.out.println("Enter 1 for addition\n" + "Enter 2 for Subtraction\n" + "Enter 3 for Multiplication\n" +
                        "Enter 4 for Division\n" + "Enter 5 for exiting program");
                n = sc.nextInt();
                switch (n) {
                    case 1 -> {
                        System.out.println("Enter first program");
                        int first = sc.nextInt();
                        System.out.println("Enter second program");
                        int second = sc.nextInt();
                        System.out.println("sum = " + (first + second));
                    }
                    case 2 -> {
                        System.out.println("Enter first program");
                        int first = sc.nextInt();
                        System.out.println("Enter second program");
                        int second = sc.nextInt();
                        System.out.println("subtract " + (first - second));
                    }
                    case 3 -> {
                        System.out.println("Enter first program");
                        int first = sc.nextInt();
                        System.out.println("Enter second program");
                        int second = sc.nextInt();
                        System.out.println("multiply " + (first * second));
                    }
                    case 4 -> {
                        System.out.println("Enter first program");
                        int first = sc.nextInt();
                        System.out.println("Enter second program");
                        int second = sc.nextInt();
                        System.out.println("divide " + (first / second));
                    }
                    case 5 -> {
                        System.out.println(0);
                    }
                }


            }while (sc.hasNextInt());
        }
    }
}

