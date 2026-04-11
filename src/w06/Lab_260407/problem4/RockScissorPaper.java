package w06.Lab_260407.problem4;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] rsp = {"종료", "가위", "바위", "보"};

        while (true) {
            System.out.print("가위(1), 바위(2), 보(3), 종료(0) 중 한 가지 선택 >> ");
            int user = sc.nextInt();

            //종료
            if (user == 0) {
                System.out.println("게임 종료");
                break;
            }

            //예외 처리
            if (user < 1 || user > 3) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            // 컴퓨터는 1~3 사이 랜덤 결정
            int com = rand.nextInt(3) + 1;

            System.out.print("게임 결과: 사람은 " + rsp[user] + ", 컴퓨터는 " + rsp[com] + " -> ");

            if (user == com) {
                System.out.println("무승부");
            } else if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) { // 가위(1) > 보(3), 바위(2) > 가위(1), 보(3) > 바위(2)
                System.out.println("사람 승리");
            } else {
                System.out.println("컴퓨터 승리"); // 무승부도 아니고, 사람이 이기는 것도 아니고, 예외도 아니니 컴퓨터 승리
            }
        }
        sc.close();
    }
}
