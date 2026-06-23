package w11;

import java.util.ArrayList;
import java.util.Scanner;

//Main class
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("--------------------");
            System.out.print("1.학생추가 \n2.전체 학생 조회 \n3.최고 점수 학생 조회 \n4.평균 점수 출력 \n5.이름 검색 \n0.종료\n");
            System.out.print("선택: ");
            int num = sc.nextInt();
            System.out.println("--------------------");

            if (num == 0) break;

            switch (num) {
                case 1 : //학생 추가
                    System.out.print("학번 입력: ");
                    String id = sc.next();

                    //중복 확인
                    boolean isDuplicate = false;
                    for (Student student : list) {
                        if (student.getId().equals(id)) {
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (isDuplicate) {
                        System.out.println("이미 존재하는 학번");
                    } else {
                        System.out.print("이름 입력: ");
                        String name = sc.next();
                        System.out.print("점수 입력: ");
                        int score = sc.nextInt();
                        list.add(new Student(id, name, score));
                    }
                    break;
                case 2: //전체 조회
                    for (Student student : list) {
                        System.out.println(student); //tostring을 이용하여 바로 학번, 이름, 점수가 정해진 포맷대로 나오도록 함.
                    }
                    break;
                case 3: //최고 점수 학생 조회
                    if (list.isEmpty()) break;
                    int max = -1;
                    for (Student student : list) {
                        if (student.getScore() > max) {
                            max = student.getScore();
                        }
                    }
                    System.out.println("최고 점수 학생 목록: ");
                    for (Student student : list) {
                        if (student.getScore() == max) {
                            System.out.println(student);
                        }
                    }

                    break;
                case 4: //평균 점수 출력
                    if (list.isEmpty()) break;
                    int sum = 0;
                    for (Student student : list) {
                        sum += student.getScore();
                    }
                    System.out.println("평균 점수: " + (double)sum/list.size());
                    break;
                case 5: //이름 검색
                    System.out.print("이름 검색: ");
                    String name = sc.next();
                    for (Student student : list) {
                        if (student.getName().equals(name)) {
                            System.out.println(student);
                        }
                    }
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); //예외처리
            }

        }
        System.out.println("프로그램 종료");
    }

}
