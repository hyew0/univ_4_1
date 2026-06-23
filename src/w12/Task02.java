package w12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task02 extends JFrame {
    public Task02() {
        setTitle("클릭 횟수 카운트"); // 프레임 창 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료 시 프로그램도 완전 종료되도록 설정

        Container c = getContentPane(); // 창의 컨텐트팬(컴포넌트 배치 영역)을 가져옴
        c.setLayout(new FlowLayout()); // 컴포넌트들을 순서대로 나열하는 FlowLayout 설정

        ActionListener listener = new ActionListener() { // 익명 클래스로 액션 리스너 객체 생성
            @Override
            public void actionPerformed(ActionEvent e) { // 버튼 클릭 시 실행되는 메서드
                JButton btn = (JButton) e.getSource(); // 클릭 이벤트가 발생한 버튼 객체 가져옴
                int count = Integer.parseInt(btn.getText()); // 버튼의 현재 텍스트(숫자)를 정수로 변환
                btn.setText(String.valueOf(count + 1)); // 숫자를 1 증가시킨 후 다시 버튼 텍스트로 설정
            }
        }; // 익명 클래스 선언 종료


        for (int i = 0; i < 5; i++) { // 5번 반복하는 반복문
            JButton btn = new JButton("0"); // 초기 텍스트가 "0"인 버튼 생성
            btn.addActionListener(listener); // 생성한 버튼에 위에서 만든 액션 리스너 등록
            c.add(btn); // 컨텐트팬에 버튼 추가
        }

        setSize(300, 200); // 프레임 창 크기를 가로 300, 세로 200으로 설정
        setVisible(true); // 프레임 창을 화면에 보이게 함
    }

    public static void main(String[] args) {
        new Task02();
    }
}
