package week9;

import java.awt.*;

public class Swap {
    static void swap(Point a, Point b) {
        Point temp = new Point(a.x, a.y);
        a.setLocation(b);
        b.setLocation(temp);
    }

    public static void main(String[] args) {
        Point x1 = new Point(10, 10);
        Point y1 = new Point(20, 20);
        swap(x1, y1);
        System.out.println("After swap: x1=" + x1 + " y1=" + y1);
    }
}
