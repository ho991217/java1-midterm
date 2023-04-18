package week6;

public class Coffee {
    private String origin;      // 원산지
    private int degreeOfRoast;  // 볶은 정도
    private int grade;          // 등급

    public String getOrigin() { return origin; }            // getter
    public int getDegreeOfRoast() { return degreeOfRoast; } // getter
    public int getGrade() { return grade; }                 // getter

    public void setOrigin(String origin) {              // setter
        this.origin = origin;
    }

    public void setDegreeOfRoast(int degreeOfRoast) {   // setter
        this.degreeOfRoast = degreeOfRoast;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setOrigin("Kenya");      // setter 호출
        coffee.setDegreeOfRoast(2);     // setter 호출
        coffee.setGrade(5);             // setter 호출

        System.out.println(coffee.getOrigin());
        System.out.println(coffee.getDegreeOfRoast());
        System.out.println(coffee.getGrade());

    }
}
