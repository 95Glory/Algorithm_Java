package StepByStep.FiveStep;

import java.util.Scanner;

//https://www.acmicpc.net/problem/
public class A6_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (char i='a'; i <= 'z'; i++) {
            System.out.print(str.indexOf(i)+" ");
        }
    }
}
