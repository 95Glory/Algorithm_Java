package StepByStep.ThreeStep;

import java.io.IOException;
import java.util.Scanner;

public class A9_2438 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star="";

        for (int i = 0; i < n; i++) {
            star +="*";
            System.out.println(star);
        }
    }
}