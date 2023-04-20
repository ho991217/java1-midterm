package week10;

public class Shape {
    private int x;
    private int y;
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
