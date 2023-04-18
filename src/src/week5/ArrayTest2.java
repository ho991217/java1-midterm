package week5;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        final int STUDENT = 5;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[STUDENT];
        for (int i = 0;i < scores.length; i++) {
            System.out.print("성적을 입력하십시오: ");
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        System.out.println("평균 성적은 " + total / STUDENT + " 입니다.");
    }
}
