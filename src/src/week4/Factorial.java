package week4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n;
        System.out.println("정수를 입력하시오: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.printf("팩토리얼 %d는 %d입니다.",n, fact);
    }
}
