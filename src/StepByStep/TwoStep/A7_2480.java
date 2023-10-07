package StepByStep.TwoStep;

import java.util.*;

public class A7_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        if (a!=b && a!=c && b!=c){
            int max = Math.max(a,Math.max(b,c));
            System.out.println(100*max);
        } else if (a==b && a!=c && b!=c) {
            System.out.println(a*100+1000);
        } else if (a==c && a!=b && c!=b) {
            System.out.println(a*100+1000);
        } else if (b==c && b!=a && c!=a) {
            System.out.println(b*100+1000);
        } else {
            System.out.println(a*1000+10000);
        }
    }
}