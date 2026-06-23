package practice.w6_260407;

import java.awt.*;

class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point("+x+","+y+")";
    }
}

public class Ex6_2 {
    public static void main(String[] args) {
        Point p = new Point(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p+"입니다. ");
    }
}
