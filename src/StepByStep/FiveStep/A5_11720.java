package StepByStep.FiveStep;

import java.util.Scanner;

//https://www.acmicpc.net/problem/
public class A5_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum +=num.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
