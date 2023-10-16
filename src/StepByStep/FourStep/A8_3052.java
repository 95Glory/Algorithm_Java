package StepByStep.FourStep;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10813
public class A8_3052 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];

        for (int i = 0; i < 10 ; i++) {
            arr[i] = sc.nextInt()%42;
        }

        arr = Arrays.stream(arr).distinct().toArray();
        System.out.println(arr.length);

    }
}