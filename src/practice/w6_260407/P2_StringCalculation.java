package practice.w6_260407;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P2_StringCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.contains("++") || str.contains("+-") || str.contains("-+") || str.contains("--")){
                System.out.println("종료");
                break;
            }

            StringTokenizer st = new StringTokenizer(str, "+-", true);

            int result = 0;

            if (st.hasMoreTokens()) {
                result = Integer.parseInt(st.nextToken().trim());
            }

            while (st.hasMoreTokens()) {
                String op = st.nextToken();

                if (st.hasMoreTokens()) {
                    int num = Integer.parseInt(st.nextToken().trim());

                    if (op.equals("+")) {
                        result += num;
                    } else if (op.equals("-")) {
                        result -= num;
                    }
                }
            }
            System.out.println("결과: " + result);
        }
        sc.close();
    }
}
