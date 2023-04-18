package week5;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] intArray = new int[5]; // 배열 선언 및 생성
        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("숫자를 입력하세요.");
            intArray[i] = in.nextInt();
            if (intArray[i] > max)
                max = intArray[i];
        }

        System.out.println("입력된 수 중에서 가장 큰 수는 " + max + "입니다.");
    }
}
