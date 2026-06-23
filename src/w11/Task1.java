package w11;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.print("요소 출력(1) 삽입 (2) 수정(3) 삭제 (4) 종료(0): ");
            int num = sc.nextInt();

            if (num == 0) break; //종료조건

            switch (num) {
                case 1 :
                    System.out.println("요소 출력 "+ list); //요소 리스트 출력
                    break;
                case 2:
                    list.add(sc.next()); //요소 추가
                    break;
                case 3:
                    System.out.print("인덱스 ");
                    int index = sc.nextInt();
                    list.set(index,sc.next()); // 인덱스 자리의 요소 교체
                    break;
                case 4:
                    System.out.print("삭제 요소값 ");
                    list.remove(sc.next()); // 요소 삭제
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); //예외처리
            }

        }
        System.out.println("프로그램 종료");
    }
}
