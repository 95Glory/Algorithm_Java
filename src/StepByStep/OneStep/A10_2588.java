package StepByStep.OneStep;

import java.util.Scanner;

public class A10_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int staticInt = sc.nextInt();
        int a = sc.nextInt();

        System.out.println(staticInt * (a % 10));
        System.out.println(staticInt * (a % 100 / 10));
        System.out.println(staticInt * (a / 100));
        System.out.println(staticInt * a);
    }
}