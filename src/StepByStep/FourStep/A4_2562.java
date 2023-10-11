package StepByStep.FourStep;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2568
public class A4_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[9];

        int maxValue = 0;
        int maxValueIndex = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (maxValue<arr[i]){
                maxValue = arr[i];
                maxValueIndex = i;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxValueIndex+1);
    }
}