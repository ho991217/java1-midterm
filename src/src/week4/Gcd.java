package week4;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int x, y, r;
        System.out.println("두 개의 정수를 입력하시오. (큰 수, 작은 수): ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        while (y != 0) {
            r = x % y;
            y = r;
        }
        System.out.println("최대 공약수는 " + x);
    }
}
