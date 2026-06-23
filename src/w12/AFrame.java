package w12;

import javax.swing.*;
import java.awt.*;

public class AFrame extends JFrame {
    public AFrame() {
        setTitle("300x300 스윙프레임만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //최종 종료를 안전하게 할 수 있게 함.
        setSize(300,300); // 프레임크기300x300
        setVisible(true); // 프레임출력
    }

    public static void main(String[] args) {
        AFrame frame = new AFrame();
    }
}
