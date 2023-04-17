package week2;

public class UninitializedVariable {
    double number; // 클래스 멤버 변수 자동으로 초기화
    public static void main(String[] args) {
        int num; // 지역변수
//        System.out.println("num =" + num); // 초기화시키지 않은 변수를 사용할 때 오류 발생
    }
}
