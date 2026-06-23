package practice.w6_260407;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class P3_Lotto {
    /*public static void main(String[] args) {
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

    }*/

    //로또번호 생성 날짜와 시간 출력
    static void time() {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year+"년 "+month+"월 "+day+"일 "+hour+":"+minute+":"+second);
    }

    //배열 출력
    static void print(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    //lotto 번호 6개만 선택 정렬
    static void sort(int[] lotto) {
        for(int i=0; i<lotto.length-2; i++) {
            int min = i; //최소값이 저장된 배열 인덱스 저장
            for(int j=i+1; j<lotto.length-1; j++) {
                if(lotto[j] < lotto[min]) {
                    min = j;
                }
            }
            int tmp = lotto[min];
            lotto[min] = lotto[i];
            lotto[i] = tmp;
        }
    }

    public static void main(String[] args) {

        //1에서 45를 저장한 1차원 배열 number 생성
        int number[] = new int[45];
        for(int i=0; i<number.length; i++)
            number[i] = i + 1;

        //로또번호를 저장할 배열 생성하고 중복되지 않게 값 저장
        int[] lotto = new int[7];

        for(int i=0; i<lotto.length; i++) {
            int randomIndex = (int)(Math.random()*45); //0~44 랜덤 인덱스
            if(number[randomIndex] != 0) { //배열 요소값이 0이면 로또번호로 선택된 것을 의미
                lotto[i] = number[randomIndex];
                number[randomIndex] = 0;
            }
            else i--;    //중복된 번호를 선택하면 다시 선택하기 위해 i값 감소
        }

        //앞 6개 값만 정렬하고 출력
        sort(lotto);
        System.out.print("로또번호: ");
        print(lotto);

        //시간 출력
        System.out.print("생성시간: ");
        time();
    }
}
