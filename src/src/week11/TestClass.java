package week11;

//class Person {
//    String name;
//    String id;
//    public Person() {
//        name = "단국대";
//        System.out.println(name);
//    }
//}

class Student extends Person {
    String grade;
    String department;
    Student() {
        super();
        System.out.println("Park");
    }
}

public class TestClass {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();
        p = s;          // 업캐스팅
    }
}
