// 메소드
package week8;

import java.util.Scanner;

public class NumberExample {
    public static int sum(int a, int b) {
        if (a < 0) a *= -1;
        if (b < 0) b *= -1;
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("결과는 " + sum(a, b));
    }
}
