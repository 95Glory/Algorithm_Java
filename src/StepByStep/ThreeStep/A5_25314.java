package StepByStep.ThreeStep;

import java.util.Scanner;

public class A5_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String staticStr = "long int";
        String Str = "long ";
        String result = staticStr;
        int cycle = (a/4)-1;

        if (cycle==0){
            System.out.println(result);
        }else {
            for (int i = 1; i <= cycle; i++) {
                result = Str+result;
            }
            System.out.println(result);
        }
    }
}