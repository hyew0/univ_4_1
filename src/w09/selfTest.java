package w09;

import java.util.LinkedList;

public class selfTest {
    public static void main(String[] args) {
        // 스택으로 사용할 LinkedList 생성
        LinkedList<String> stack = new LinkedList<>();

        // 스택에 요소 추가 (push)
        stack.push("첫 번째 문서");
        stack.push("두 번째 문서");
        stack.push("세 번째 문서");

        // 최상단 요소 확인 (제거하지 않음)
        System.out.println("현재 스택 최상단(peek): " + stack.peek()); // 출력: 세 번째 문서

        // 최상단 요소 꺼내기 (pop)
        System.out.println("스택에서 꺼냄(pop): " + stack.pop()); // 출력: 세 번째 문서

        // pop 수행 후 최상단 요소 확인
        System.out.println("pop 이후 스택 최상단(peek): " + stack.peek()); // 출력: 두 번째 문서
    }

}
