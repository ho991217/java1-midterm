package week10;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.set(5, 3);
        r1.setHeight(20);
        r1.setWidth(10);
        r2.set(8, 9);
        r2.setWidth(10);
        r2.setHeight(20);

        r1.print();
        r1.draw();
        r2.print();
        r2.draw();
    }
}
