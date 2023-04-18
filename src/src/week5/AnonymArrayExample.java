package week5;

public class AnonymArrayExample {
    public static int sum(int[] numbers) {
        int total = 0;
        for (int i =0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("합계는 " + sum(new int[] { 1, 2, 3, 4 })); // 익명 배열
    }
}
