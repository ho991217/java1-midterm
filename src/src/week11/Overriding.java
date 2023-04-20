package week11;

class Person {
    String phone;
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
}

class Professor extends Person {
    @Override
    public String getPhone() {
        return "Professor: " + super.getPhone();
    }
}

public class Overriding {
    public static void main(String[] args) {
        Professor a = new Professor();
        a.setPhone("010-0000-0000");
        System.out.println(a.getPhone());
        Person p = a;
        System.out.println(p.getPhone());
    }
}