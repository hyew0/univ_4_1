package w12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task01 extends JFrame {
    public Task01() {
        setTitle("드래깅동안 YELLOW로 변경"); // 프레임 창 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료 시 프로그램도 완전 종료되도록 설정

        Container c = getContentPane(); // 창의 컨텐트팬(배경 영역)을 가져옴
        c.setBackground(Color.GREEN); // 기본 배경색을 녹색으로 지정

        MouseAdapter adapter = new MouseAdapter() { // 익명 클래스로 마우스 어댑터 객체 생성
            @Override
            public void mouseDragged(MouseEvent e) { // 마우스 드래그 시 실행되는 메서드
                c.setBackground(Color.YELLOW); // 컨텐트팬 배경색을 노란색으로 변경
            }

            @Override
            public void mouseReleased(MouseEvent e) { // 마우스 버튼을 뗄 때 실행되는 메서드
                c.setBackground(Color.GREEN); // 컨텐트팬 배경색을 다시 녹색으로 원복
            }
        }; // 익명 클래스 선언 종료

        c.addMouseListener(adapter); // 컨텐트팬에 마우스 리스너(릴리스 감지용) 등록
        c.addMouseMotionListener(adapter); // 컨텐트팬에 마우스 모션 리스너(드래그 감지용) 등록

        setSize(300, 200); // 프레임 창 크기를 가로 300, 세로 200으로 설정
        setVisible(true); // 프레임 창을 화면에 보이게 함
    }

    public static void main(String[] args) {
        new Task01();
    }
}
