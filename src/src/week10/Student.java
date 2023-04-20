package week10;

public class Student extends Person{
    void set() {
        age = 30;
        name = "홍길동";
        height = 175;
        setWeight(70);
    }
    @Override
    public String toString() {
        return "나이는 " + age + "세, 이름은 " + name + ", 신장은 " + height + "cm 이고, 몸무게는 " + getWeight() + "kg 이다.";
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.set();
        System.out.println(s);
    }
}
