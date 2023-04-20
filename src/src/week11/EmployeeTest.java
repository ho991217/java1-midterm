package week11;

class Date {
    private int year;
    private int month;
    private int date;

    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date [ year=" + year + ", month= " + month + ", date=" + date + " ]";
    }
}

class Employee {
    private final String name;
    private final Date birthDate;           // has-a 관계

    public Employee(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return "Employee [ name=" + name + ", dateOfBirth=" + birthDate + " ]";
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Date dateOfBirth = new Date(1999, 12, 17);
        Employee employee = new Employee("홍길동", dateOfBirth);
        System.out.println(dateOfBirth);
        System.out.println(employee);
    }
}
