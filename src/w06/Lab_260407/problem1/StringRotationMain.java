package w06.Lab_260407.problem1;

import java.util.Scanner;

public class StringRotationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringRotation rotator = new StringRotation();

        while (true) {
            System.out.print("입력) ");
            String str = sc.next();
            int rotation = sc.nextInt();

            if (rotation == 0) {
                System.out.println("종료함");
                break;
            }

            rotator.rotateAndPrint(str, rotation);
        }
        sc.close();
    }
}