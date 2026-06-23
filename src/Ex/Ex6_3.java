package Ex;

import java.util.Objects;

class Point6_3 {
    int x,y;

    public Point6_3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object object) {
        Point6_3 p = (Point6_3) object;
        if (x == p.x && y == p.y) {
            return true;
        }
        return x == p.x && y == p.y;
    }
}

public class Ex6_3 {
    public static void main(String[] args) {
        Point6_3 a = new Point6_3(2, 3);
        Point6_3 b = new Point6_3(2, 3);
        Point6_3 c = new Point6_3(3, 4);

        if (a == b) System.out.println("a==b");
        if( a.equals(b)) System.out.println("a is equal to b");
        if (a.equals(c)) System.out.println("a is equal to c");
    }
}
