package StepByStep.FourStep;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10871
public class A2_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]<x){
                System.out.print(arr[i]+" ");
            }
        }
    }
}