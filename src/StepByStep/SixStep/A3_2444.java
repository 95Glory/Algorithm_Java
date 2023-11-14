package StepByStep.SixStep;

import java.util.Scanner;

//https://www.acmicpc.net/problem/
public class A3_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n-1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n*2-1)-(i*2); j++) {//7 5
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
