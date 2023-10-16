package StepByStep.FourStep;

import java.io.IOException;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10813
public class A9_10811 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr [] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            int left = sc.nextInt()-1;
            int right = sc.nextInt()-1;

            while (left < right){
                int temp = arr[right];
                arr[right--] = arr[left];
                arr[left++] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}