package week10;

public class Point {
    private int x, y;
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

