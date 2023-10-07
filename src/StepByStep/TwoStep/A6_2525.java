package StepByStep.TwoStep;

import java.util.Scanner;

public class A6_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sumBC = b+c;

        if (sumBC>=60){
            a += ((sumBC/60));
            if (a>=24){
                System.out.println((a-24)+" "+(sumBC%60));
            }else{
                System.out.println(a+" "+sumBC%60);
            }
        }else {
            System.out.println(a+" "+(b+c));
        }
    }
}