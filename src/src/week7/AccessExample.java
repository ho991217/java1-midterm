package week7;

class Sample {
    public int a;
    private int b;
    int c;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

public class AccessExample {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        aClass.setB(10);
        aClass.c = 10;
    }
}
