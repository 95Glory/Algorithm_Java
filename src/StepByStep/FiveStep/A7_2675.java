package StepByStep.FiveStep;

import java.util.Scanner;

//https://www.acmicpc.net/problem/
public class A7_2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int nn = sc.nextInt();
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < nn; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
