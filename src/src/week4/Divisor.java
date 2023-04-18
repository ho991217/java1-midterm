package week4;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        System.out.println("양의 정수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n + "의 약수는 :");
        for (int i = 1; i<= n; ++i) {
            System.out.print(n % i == 0 ? i + "\n" : "");
        }
    }
}
