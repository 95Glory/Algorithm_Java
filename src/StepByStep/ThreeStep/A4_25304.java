package StepByStep.ThreeStep;

import java.util.Scanner;

public class A4_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sumReciept = sc.nextInt();
         int n = sc.nextInt();
         int sum = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int qut = sc.nextInt();
            sum += price*qut;
        }

        if (sumReciept == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}