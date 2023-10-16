package StepByStep.FourStep;

import java.io.IOException;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10813
public class A10_1546 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double arr [] = new double[n];
        double max = -1;
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }

        System.out.println(sum/n);
    }
}