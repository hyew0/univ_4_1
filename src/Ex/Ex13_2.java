package Ex;

import java.util.ArrayList;

public class Ex13_2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("체리");
        fruits.add("대추");

        System.out.println("초기 ArrayList: " + fruits);

        System.out.println("첫번째 요소: " + fruits.get(0));
        System.out.println("두번째 요소: " + fruits.get(1));

        fruits.set(1, "블루베리");
        System.out.println("수정 후 ArrayList: " + fruits);

        fruits.remove(2);
        System.out.println("인덱스 2의 요소 삭제 후 ArrayList: " + fruits);

        System.out.println("요소 반복 출력");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("size: " + fruits);

    }
}
