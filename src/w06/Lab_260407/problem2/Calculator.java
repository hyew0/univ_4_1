package w06.Lab_260407.problem2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("수식 입력 >> ");
            String input = sc.nextLine();

            // 연속된 연산자 기호가 문자열에 들어가 있으면 프로그램 종료
            if (input.contains("++") || input.contains("--") ||
                    input.contains("+-") || input.contains("-+")) {
                System.out.println("종료조건 입력됨. 프로그램을 종료합니다.");
                break;
            }

            // "+" 와 "-" 를 기준으로 토큰 분리 (연산자도 토큰으로 포함)
            StringTokenizer st = new StringTokenizer(input, "+-", true);
            int result = 0;

            // 첫 번째 숫자 추출해서 초기 결과값으로 설정.
            if (st.hasMoreTokens()) {
                result = Integer.parseInt(st.nextToken().trim());
            }

            // 남은 토큰을 순차적으로 처리
            while (st.hasMoreTokens()) {
                String op = st.nextToken();

                if (st.hasMoreTokens()) {
                    int num = Integer.parseInt(st.nextToken().trim()); // 다음 숫자 토큰 추출

                    // 연산자에 따른 계산 실행
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
