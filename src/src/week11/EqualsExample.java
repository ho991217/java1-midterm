package week11;

class Rect {
    int width;
    int height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Rect p) {
        return width * height == p.width * p.height;
    }
}

public class EqualsExample {
    public static void main(String[] args) {
        Rect a = new Rect(2, 3);
        Rect b = new Rect(3, 2);
        Rect c = new Rect(3, 4);
        if (a.equals(b)) System.out.println("a equals b");
        if (a.equals(c)) System.out.println("a equals c");
        if (b.equals(c)) System.out.println("b equals c");
    }
}
