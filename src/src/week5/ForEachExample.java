package week5;

public class ForEachExample {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int k : num) {
            sum += k;
        }
        System.out.println("합은 " + sum);
    }
}
