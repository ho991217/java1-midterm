package week10;

public class Rectangle extends Shape{
    private int width;
    private int height;
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public double area() {
        return (double) width * height;
    }
    void draw() {
        System.out.println("사각형 " + this.getX() + " * " + this.getY() + "의 영역은 " + this.area());
    }
}
