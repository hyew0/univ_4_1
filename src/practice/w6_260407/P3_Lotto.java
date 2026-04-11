package practice.w6_260407;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P3_Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int bonus = 0;
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(45) + 1;

            for (int j = 0; j < i ; j++) {
                if (lotto[j] == num) {
                    i--;
                    break;
                }
            }
            lotto[i] = num;
        }

        Arrays.sort(lotto);

        while (true) {
            bonus = random.nextInt(45) + 1;
            boolean isDuplicate = false;

            for (int i = 0; i < 6; i++) {
                if (lotto[i] == bonus) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                break;
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }

        System.out.println("+ " + bonus);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println("생성 시간: " + now.format(formatter));

    }
}
