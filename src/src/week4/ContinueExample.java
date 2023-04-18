package week4;

public class ContinueExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1)     // 홀수라면
                continue;
            else                // 짝수라면
                sum += i;
        }
        System.out.println("1부터 100까지 짝수의 합은 " + sum);
    }
}
