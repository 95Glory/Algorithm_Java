package StepByStep.FourStep;

import java.io.IOException;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10813
public class A7_5597 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            arr[a-1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (arr[i] != 1){
                System.out.println(i+1);
            }
        }
    }
}