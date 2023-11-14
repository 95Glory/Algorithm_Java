package StepByStep.SixStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/
public class A6_1316 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int result = 0;
        for (int i = 0; i < a; i++) {
            String str = bf.readLine();
            char[] arr = str.toCharArray();

            StringBuffer sb = new StringBuffer();
            StringBuffer sb1 = new StringBuffer();
            String resultFlag = "Y";

            for (int j = 1; j < arr.length; j++) {
                String charChange = "N";
                char qq = arr[j - 1];
                sb.append(qq);

                if (arr[j - 1] != arr[j]) {
                    charChange = "Y";
                }
                String qw = String.valueOf(arr[j]);
                if (charChange == "Y" && sb.toString().contains(qw)) {
                    resultFlag = "N";
                }
            }
            if (resultFlag.equals("Y")) {
                result++;
            }
        }
        System.out.println(result);
    }
}
