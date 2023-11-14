package StepByStep.SixStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//https://www.acmicpc.net/problem/
public class A5_2941 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String [] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (int i = 0; i < arr.length; i++) {
            if (a.contains(arr[i])){
                a = a.replace(arr[i],"@");
            }
        }
        int result = a.length();
        System.out.println(result);
    }
}
