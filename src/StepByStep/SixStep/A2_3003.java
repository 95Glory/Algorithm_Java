package StepByStep.SixStep;

import java.io.IOException;
import java.util.Scanner;

//https://www.acmicpc.net/problem/
public class A2_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb= new StringBuffer();
        int [] arr = {1,1,2,2,2,8};
        int [] result = new int[6];

        for (int i = 0; i < 6; i++) {
            sb.append(arr[i]-sc.nextInt()).append(" ");
        }
        System.out.println(sb);
    }
}
