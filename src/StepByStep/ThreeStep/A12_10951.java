package StepByStep.ThreeStep;

import java.io.IOException;
import java.util.Scanner;

public class A12_10951 {

    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);

        while(in.hasNextInt()){
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a+b);
        }
    }
}