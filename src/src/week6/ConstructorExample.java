package week6;

public class ConstructorExample {
    int id;
    public ConstructorExample(int x) {
        this.id = x;
    }
    public ConstructorExample() { // 생성자 오버로딩
        this.id = 0;
    }

    public void set(int x) { this.id = x; }
    public int get() { return this.id; }

    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample(3);
        ConstructorExample obj2 = new ConstructorExample();
        ConstructorExample s;
        s = new ConstructorExample();
        s.set(10);
        System.out.println(obj1.get());
        System.out.println(obj2.get());
        System.out.println(s.get());
    }
}
