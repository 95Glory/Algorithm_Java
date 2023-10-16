package StepByStep.FiveStep;

import java.util.Scanner;

//https://www.acmicpc.net/problem/
public class A1_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        System.out.println(str.charAt(n-1));
    }
}
