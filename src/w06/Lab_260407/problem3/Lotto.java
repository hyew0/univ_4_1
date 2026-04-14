package w06.Lab_260407.problem3;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        /*Math.random()을 쓰면 (int)(Math.random() * 45) + 1 처럼 실수(double)를 정수(int)로 강제 변환하는 복잡한 수식을 써야 해서,
         Random 객체를 사용하여 rand.nextInt(45)처럼 정수 추출 전용 메서드 사용함.
         */
        Random rand = new Random();

        // 숫자 6개를 랜덤으로 추출 (중복 제거)
        for (int i = 0; i < 6; i++) {
            lotto[i] = rand.nextInt(45) + 1; // 1 - 45 중 랜덤값 추출
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--; // 중복 발생 시 다시 추출
                    break;
                }
            }
        }

        // 추출된 수는 오름차순 정렬
        Arrays.sort(lotto);

        // 마지막 보너스 숫자 중복 안 된 수 나올 때까지 추출 (기존 6개와 중복 안 되게)
        int bonus;
        while (true) {
            bonus = rand.nextInt(45) + 1;
            boolean isDuplicate = false;
            for (int num : lotto) {
                if (num == bonus) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) break;
        }

        // 전체 로또번호 출력
        for (int num : lotto) {
            System.out.print(num + " ");
        }
        System.out.println("+ " + bonus);

        // 현재 시간(년월일 시분초) 출력
        // [참고] Calendar 클래스는 월(Month)을 0부터 계산하여 직관적이지 않고 버그 발생 쉬움.
        // 따라서 직관적이고 깔끔한 출력 형식을 지정할 수 있는 Date와 SimpleDateFormat을 사용.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println(sdf.format(new Date()));
    }
}
