package StepByStep.FiveStep;

import java.util.Scanner;

//https://www.acmicpc.net/problem/
public class A3_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length()-1));
        }
    }
}
