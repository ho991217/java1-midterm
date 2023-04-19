package week9;

public class Add {
    static String add(String s1, String s2) { return s1 + s2; }
    static int add(int s1, int s2) { return s1 + s2; }
    static double add(double d1, double d2) { return d1 + d2; }

    public static void main(String[] args) {
        String newStr = add("Hello,", "World!");
        int sumInt = add(10, 4);
        double sumDouble = add(5.1, 3.5);
        System.out.println(newStr);
        System.out.println(sumInt);
        System.out.println(sumDouble);
    }
}
