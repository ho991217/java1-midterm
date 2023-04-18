package week5;

public class EnumExample {
    enum Month {
        JAN(1, "January"), FEB(2, "Febrary"),
        MAR(3, "March"), APR(4, "April"),
        MAY(5, "May"), JUN(6, "Jun"),
        JUL(7, "July"), AUG(8, "August"),
        SEP(9, "September"), OCT(10, "October"),
        NOV(11, "November"), DEC(12, "December");

        final int month;
        final String name;
        Month(int month, String name) {
            this.month = month;
            this.name = name;
        }
        int getMonth() {return month;}
        String getName() {return name;}
    }
    public static void main(String[] args) {
        Month[] m = Month.values();
        for (Month el : m)
            System.out.println(el.getMonth() + "월은 영어로 " + el.getName());
    }
}
