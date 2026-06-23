package Ex;

class Point6_1 {
    private int x, y;

    public Point6_1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Ex6_1 {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Point6_1 p = new Point6_1(2, 3);
        print(p);
    }
}
