package w06.Lab_260407.problem3;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println(sdf.format(new Date()));
    }
}
