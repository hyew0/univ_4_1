package w04.task260324.baseArray;

import java.util.Scanner;

public class MainBinaryArray {
    public static void main(String[] args) {
        int threshold = 50; // 임계값 50
        BinaryArray bArray = new BinaryArray(10, threshold);

        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");

        for(int i=0; i<bArray.length(); i++) { // bArray.length()는 10
            int n = scanner.nextInt();
            bArray.add(n);
        }

        bArray.print();
        scanner.close();
    }
}
