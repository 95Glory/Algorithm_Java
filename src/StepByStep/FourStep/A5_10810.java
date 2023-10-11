package StepByStep.FourStep;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10810
public class A5_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr [] = new int[n];

        for (int i = 0; i < m; i++) {

            int startIndex = sc.nextInt();
            int endIndex = sc.nextInt();
            int value = sc.nextInt();

            for (int j = startIndex-1; j < endIndex ; j++) {
                arr[j] = value;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}