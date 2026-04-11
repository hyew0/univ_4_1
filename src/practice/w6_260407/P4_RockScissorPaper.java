package practice.w6_260407;

import java.util.Random;
import java.util.Scanner;

public class P4_RockScissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] rsp = {"종료", "가위", "바위", "보"};

        while (true) {

            System.out.print("가위(1), 바위(2), 보(3), 종료(0) 중 한 가지 선택 >> ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("게임 종료");
                break;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("잘못된 입력");
                continue;
            }


            int computer = random.nextInt(3) + 1;

            System.out.print("게임 결과: 사람은 " + rsp[choice] + ", 컴퓨터는 " + rsp[computer] + " -> ");

            if (computer == choice) {
                System.out.println("무승부");
            } else if ((computer == 1 && choice == 3) ||
                    (computer == 2 && choice == 1) ||
                    (computer == 3 && choice == 2)
            ) {
                System.out.println("컴퓨터 승리");
            } else {
                System.out.println("유저 승리");
            }


        }

    }
}
