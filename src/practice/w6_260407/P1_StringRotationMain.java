package practice.w6_260407;

import java.util.Scanner;

public class P1_StringRotationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P1_StringRotation rotate = new P1_StringRotation();

        while (true) {
            System.out.print("입력) ");

            String string = sc.next();
            int num = sc.nextInt();

            if (num == 0) {
                System.out.print("종료함");
                break;
            }

            rotate.rotateAndPrint(string, num);

        }
    }
}

class P1_StringRotation {
    public void rotateAndPrint(String string, int num) {
        int length = string.length();
        int rotate = length /Math.abs(num);

        for (int i = 0; i < rotate; i++) {
            int shift = (num * (i+1)) % length;

            if (shift < 0) shift += length;

            String result = string.substring(shift) + string.substring(0, shift);
            System.out.println(result);

        }
    }
}

