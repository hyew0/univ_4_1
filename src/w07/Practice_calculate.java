package w07;

import java.util.Scanner;

public class Practice_calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, result;
        String operator;

        while (true) {
            try {
                num1 = sc.nextInt();
                operator = sc.next();

                if (operator.equals("=")) {
                    break;
                }

                num2 = sc.nextInt();

                result = switch (operator) {
                    case "+" -> num1 + num2;
                    case "-" -> num1 - num2;
                    case "*" -> num1 * num2;
                    case "/" -> num1 / num2;
                    case "%" -> num1 % num2;
                    default -> throw new IllegalArgumentException("오류: 지원하지 않는 연산자");
                };

                System.out.println("결과: " + result);
            } catch (ArithmeticException e) {
                System.out.println("오류: 0은 입력 불가능");
                sc.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("오류: 정수가 아님. 재입력 필요");
                sc.nextLine(); // 버퍼 비우기: 잘못 입력된 문자열을 제거하여 무한 루프 방지
            } catch (IllegalArgumentException e) { //지원하지 않는 연산자 입력 시 오류 처리
                System.out.println(e.getMessage());
                sc.nextLine();
            } finally {
                sc.close();
            }
        }
    }
}
