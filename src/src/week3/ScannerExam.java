package week3;
import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이, 체중, 신장을 차례로 입력하시오.");
        System.out.println("당신의 나이: " + Integer.parseInt(sc.next()));   // string 으로 입력받고 int로 파싱
        System.out.println("당신의 체중: " + Double.parseDouble(sc.next())); // string 으로 입력받고 double로 파싱
        System.out.println("당신의 신장: " + Double.parseDouble(sc.next())); // string 으로 입력받고 double로 파싱
    }
}
